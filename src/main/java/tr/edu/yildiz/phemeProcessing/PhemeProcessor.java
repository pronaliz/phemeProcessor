package tr.edu.yildiz.phemeProcessing;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.log4j.Logger;
import tr.edu.yildiz.phemeProcessing.pojos.Annotations;
import tr.edu.yildiz.phemeProcessing.pojos.Tweet;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PhemeProcessor {
    final static Logger logger = Logger.getLogger(PhemeProcessor.class);


    public static void main(String[] args) {

        PhemeProcessor phemeProcessor = new PhemeProcessor();
        ObjectMapper objectMapper = new ObjectMapper();

        //start by loading annotation files to determine the threads
        File annotationsFile = new File("C:\\Users\\jehad\\Desktop\\phemeProcessor\\phemeDataset/annotations/original_en-scheme-annotations.json");
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
            phemeProcessor.readMainTweet(annotationsList.get(0));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }


    }

    public Tweet readMainTweet(Annotations annotations) {
        ObjectMapper objectMapper = new ObjectMapper();
        Tweet mainTweet = null;
        String mainTweetPath = "C:\\Users\\jehad\\Desktop\\phemeProcessor\\phemeDataset/threads/en/" + annotations.getEvent() + "/" + annotations.getThreadid();
        File mainTweetJSONFile = new File(mainTweetPath + "/source-tweets/" + annotations.getThreadid() + ".json");
        try {
            FileInputStream fileInputStream = new FileInputStream(mainTweetJSONFile);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String tweetFileString = "";
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {

                tweetFileString = tweetFileString.concat(line);
            }
            mainTweet = objectMapper.readValue(tweetFileString, Tweet.class);
            logger.info("Finished importing main Tweet file");
            logger.info("Main Tweet JSON file");
            logger.info(mainTweet.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("Number of Favs" + mainTweet.getFavoriteCount());
        logger.info("Number of Retweets:" + mainTweet.getRetweetCount());
        return mainTweet;

        //TODO extract this method to obtain all tweets main and replies

    }

    public List<Tweet> getReactions() {
        //TODO implement this!
        return Collections.emptyList();
    }

    public Map<Pair<String, String>, Annotations> getAllAnnotations() {
        //TODO implement this for the map will be needed to determine the polarity of reactions on main tweet
        return Collections.EMPTY_MAP;
    }
}
