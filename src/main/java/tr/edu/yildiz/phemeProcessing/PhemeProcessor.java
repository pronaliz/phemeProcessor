package tr.edu.yildiz.phemeProcessing;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.log4j.Logger;
import tr.edu.yildiz.phemeProcessing.pojos.Annotations;
import tr.edu.yildiz.phemeProcessing.pojos.Tweet;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PhemeProcessor {
    final static Logger logger = Logger.getLogger(PhemeProcessor.class);
    final static String SOURCE = "source-tweets";
    final static String REACTION = "reactions";


    public static void main(String[] args) {

        final PhemeProcessor phemeProcessor = new PhemeProcessor();
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

            //test
            String tweetPath = datasetPath + "threads/en/" + annotationsList.get(0).getEvent() + "/" + annotationsList.get(0).getThreadid();
            File mainTweetJSONFile = new File(tweetPath + "/" + SOURCE + "/" + annotationsList.get(0).getThreadid() + ".json");
            Tweet mainTweet = phemeProcessor.getTweet(mainTweetJSONFile);
            List<Tweet> reactions = phemeProcessor.getReactions(annotationsList.get(0), datasetPath);

            phemeProcessor.getPopularity(mainTweet);
            List<Double> popularity = reactions.stream().map(phemeProcessor::getPopularity).collect(Collectors.toList());
            logger.info("List of popularity Size: " + popularity.size());
            popularity.stream().forEach(logger::info);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }


    }

    public double getPopularity(Tweet tweet) {
        return (double) (tweet.getUser().getFollowersCount() - tweet.getUser().getFriendsCount())
                / (double) (tweet.getUser().getFollowersCount() + tweet.getUser().getFriendsCount());
    }

    public Tweet getTweet(File tweetJSONFile) {
        ObjectMapper objectMapper = new ObjectMapper();
        Tweet tweet = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(tweetJSONFile);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String tweetFileString = "";
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {

                tweetFileString = tweetFileString.concat(line);
            }
            tweet = objectMapper.readValue(tweetFileString, Tweet.class);
            logger.info("Finished importing tweet file");
            logger.info("Tweet JSON file " + tweet.toString());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("Number of Favs: " + tweet.getFavoriteCount());
        logger.info("Number of Retweets:" + tweet.getRetweetCount());
        return tweet;
    }

    public List<Tweet> getReactions(Annotations annotations, String datasetPath) {
        String reactionPath = datasetPath + "threads/en/" + annotations.getEvent() + "/" + annotations.getThreadid() + "/";
        File reactionsFolder = new File(reactionPath + REACTION);
        List<Tweet> reactions = new ArrayList<Tweet>();
        for (File tweetReaction : reactionsFolder.listFiles()) {
            //logger.info("List of Reaction JSON Tweet files");
            //logger.info(reactionsFolder.list());
            reactions.add(getTweet(tweetReaction));
        }
        logger.info("Number of Reactions: " + reactions.size());
        return reactions;
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
