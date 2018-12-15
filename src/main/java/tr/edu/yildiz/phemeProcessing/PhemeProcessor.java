package tr.edu.yildiz.phemeProcessing;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.log4j.Logger;
import tr.edu.yildiz.phemeProcessing.pojos.Annotations;
import tr.edu.yildiz.phemeProcessing.pojos.Tweet;

import java.io.*;
import java.util.*;

public class PhemeProcessor {
    final static Logger logger = Logger.getLogger(PhemeProcessor.class);


    public static void main(String[] args) {

        PhemeProcessor phemeProcessor = new PhemeProcessor();
        ObjectMapper objectMapper = new ObjectMapper();
        String datasetPath = "C:\\Users\\jehad\\Desktop\\phemeProcessor\\phemeDataset/";
        //start by loading annotation files to determine the threads
        File annotationsFile = new File(datasetPath + "annotations/original_en-scheme-annotations.json");
        try {
            FileInputStream fileInputStream = new FileInputStream(annotationsFile);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

            String line = null;
            List<Annotations> annotationsList = new ArrayList<Annotations>();
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("#")) continue;
                annotationsList.add(objectMapper.readValue(line, Annotations.class));
            }
            logger.info("Finished importing main annotations file");
            logger.info("number of annotations imported: " + annotationsList.size());
            logger.info("First annotation imported is: " + annotationsList.get(0).toString());
            logger.info("Last annotation imported: " + annotationsList.get(annotationsList.size() - 1).toString());
            phemeProcessor.getAllAnnotations(datasetPath);
            phemeProcessor.getTweet(annotationsList.get(0), datasetPath);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }


    }

    public Tweet getTweet(Annotations annotations, String datasetPath) {
        ObjectMapper objectMapper = new ObjectMapper();
        Tweet tweet = null;
        String mainTweetPath = datasetPath + "threads/en/" + annotations.getEvent() + "/" + annotations.getThreadid();
        File mainTweetJSONFile = new File(mainTweetPath + "/source-tweets/" + annotations.getThreadid() + ".json");
        try {
            FileInputStream fileInputStream = new FileInputStream(mainTweetJSONFile);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String tweetFileString = "";
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {

                tweetFileString = tweetFileString.concat(line);
            }
            tweet = objectMapper.readValue(tweetFileString, Tweet.class);
            logger.info("Finished importing main Tweet file");
            logger.info("Tweet JSON file " + tweet.toString());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("Number of Favs" + tweet.getFavoriteCount());
        logger.info("Number of Retweets:" + tweet.getRetweetCount());
        return tweet;

        //TODO extract this method to obtain all tweets main and replies

    }

    public List<Tweet> getReactions() {
        //TODO implement this!
        return Collections.emptyList();
    }

    public Map<Pair<String, String>, Annotations> getAllAnnotations(String datasetPath) {
        File annotationsFile = new File(datasetPath + "annotations/en-scheme-annotations.json");
        ObjectMapper objectMapper = new ObjectMapper();
        Map<Pair<String, String>, Annotations> annotationsMap = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(annotationsFile);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

            String line = null;
            annotationsMap = new HashMap<Pair<String, String>, Annotations>();
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("#")) continue;
                annotationsMap.put(Pair.of((objectMapper.readValue(line, Annotations.class)).getThreadid(),
                        (objectMapper.readValue(line, Annotations.class)).getTweetid()), (objectMapper.readValue(line, Annotations.class)));
            }
            logger.info("Finished importing all annotations file");
            logger.info("number of annotations imported: " + annotationsMap.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
        return annotationsMap;
    }
}
