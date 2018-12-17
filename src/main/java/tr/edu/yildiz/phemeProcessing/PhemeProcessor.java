package tr.edu.yildiz.phemeProcessing;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.log4j.Logger;
import tr.edu.yildiz.phemeProcessing.pojos.Annotations;
import tr.edu.yildiz.phemeProcessing.pojos.ReplyAnnotation;
import tr.edu.yildiz.phemeProcessing.pojos.Tweet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("C:\\Users\\jbaeth\\IdeaProjects\\phemeProcessor\\phemeDataset/output.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder builder = new StringBuilder();
        String ColumnNamesList = "Thread ID,Distance From Positivity, Thread Certainity, Number of Interactions";
        // No need give the headers Like: id, Name on builder.append
        builder.append(ColumnNamesList + "\n");
        final PhemeProcessor phemeProcessor = new PhemeProcessor();
        ObjectMapper objectMapper = new ObjectMapper();
        String datasetPath = "C:\\Users\\jbaeth\\IdeaProjects\\phemeProcessor\\phemeDataset/";
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
            Map<String, Annotations> annotationsMap = new HashMap<>();
            for (Annotations annotation : annotationsList) {
                annotationsMap.put(annotation.getThreadid(), annotation);

            }
            logger.debug("Finished importing main annotations file");
            logger.debug("number of annotations imported: " + annotationsList.size());

            for (Annotations annotation : annotationsList) {
                logger.debug("First annotation imported is: " + annotation.toString());
                Map<Pair<String, String>, ReplyAnnotation> replyAnnotationMap = phemeProcessor.getAllAnnotations(datasetPath);

                //test
                String tweetPath = datasetPath + "threads/en/" + annotation.getEvent() + "/" + annotation.getThreadid();
                File mainTweetJSONFile = new File(tweetPath + "/" + SOURCE + "/" + annotation.getThreadid() + ".json");
                Tweet mainTweet = phemeProcessor.getTweet(mainTweetJSONFile);
                List<Tweet> reactions = phemeProcessor.getReactions(annotation, datasetPath);

                double mainTweetPopularity = phemeProcessor.getPopularity(mainTweet);
                List<Double> popularity = reactions.stream().filter(tweet -> {
                    ReplyAnnotation replyAnnotation = replyAnnotationMap.get(Pair.of(mainTweet.getIdStr(), tweet.getIdStr()));
                    return replyAnnotation != null && !replyAnnotation.getResponsetypeVsSource().equals("comment");
                }).map(tweet -> {
                    ReplyAnnotation replyAnnotation = replyAnnotationMap.get(Pair.of(mainTweet.getIdStr(), tweet.getIdStr()));

                    if (replyAnnotation != null && (replyAnnotation.getResponsetypeVsSource().equals("disagreed") ||
                            replyAnnotation.getResponsetypeVsSource().equals("appeal-for-more-information"))) {
                        return (-1 * Math.abs(phemeProcessor.getPopularity(tweet)));
                    } else {
                        //return Math.abs(phemeProcessor.getPopularity(tweet));
                        return 0.0;
                    }


                }).collect(Collectors.toList());
                logger.debug("List of popularity Size: " + popularity.size());
                popularity.stream().forEach(logger::debug);
                Double cumulativeCredibility = 0.0;
                cumulativeCredibility = popularity.stream().mapToDouble(Math::abs).sum();
                cumulativeCredibility = cumulativeCredibility + mainTweetPopularity;
                double distanceFromPosititvity = 0.0;
                //double distanceFromPosititvity = Math.abs(mainTweetPopularity) / Math.abs(cumulativeCredibility);
                for (double credibility : popularity) {
                    distanceFromPosititvity = distanceFromPosititvity + (credibility / Math.abs(cumulativeCredibility));
                    logger.debug("Current Value of distance From positivity" + distanceFromPosititvity);
                }
                builder.append(mainTweet.getIdStr() + ",");
                builder.append(distanceFromPosititvity + ",");
                builder.append(annotationsMap.get(mainTweet.getIdStr()).getCertainty() + ",");
                builder.append(reactions.size());
                builder.append('\n');

                logger.info("#################################################");
                logger.info("DistanceFromPositivity equals: " + distanceFromPosititvity);
                logger.info("Main Tweet Certainty: " + annotationsMap.get(mainTweet.getIdStr()).getCertainty());
                logger.info("#################################################");

            }

            logger.info("#################################################");
            logger.info("############### - Final Report - ################");
            logger.info(builder.toString());
            logger.info("############### - Final Report End - ###############");
            logger.info("#################################################");
            pw.write(builder.toString());
            pw.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }


    }

    public double getPopularity(Tweet tweet) {
        return (double) Math.abs(tweet.getUser().getFollowersCount() - tweet.getUser().getFriendsCount())
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
            logger.debug("Finished importing tweet file");
            logger.debug("Tweet JSON file " + tweet.toString());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.debug("Number of Favs: " + tweet.getFavoriteCount());
        logger.debug("Number of Retweets:" + tweet.getRetweetCount());
        return tweet;
    }

    public List<Tweet> getReactions(Annotations annotations, String datasetPath) {
        String reactionPath = datasetPath + "threads/en/" + annotations.getEvent() + "/" + annotations.getThreadid() + "/";
        File reactionsFolder = new File(reactionPath + REACTION);
        List<Tweet> reactions = new ArrayList<Tweet>();
        for (File tweetReaction : reactionsFolder.listFiles()) {
            logger.debug("List of Reaction JSON Tweet files");
            logger.debug(reactionsFolder.list());
            reactions.add(getTweet(tweetReaction));
        }
        logger.debug("Number of Reactions: " + reactions.size());
        return reactions;
    }

    public Map<Pair<String, String>, ReplyAnnotation> getAllAnnotations(String datasetPath) {
        File annotationsFile = new File(datasetPath + "annotations/en-scheme-annotations.json");
        ObjectMapper objectMapper = new ObjectMapper();
        Map<Pair<String, String>, ReplyAnnotation> annotationsMap = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(annotationsFile);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

            String line = null;
            annotationsMap = new HashMap<>();
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("#")) continue;
                annotationsMap.put(Pair.of((objectMapper.readValue(line, ReplyAnnotation.class)).getThreadid(),
                        (objectMapper.readValue(line, Annotations.class)).getTweetid()), (objectMapper.readValue(line, ReplyAnnotation.class)));
            }
            logger.debug("Finished importing all annotations file");
            logger.debug("number of annotations imported: " + annotationsMap.size());
        } catch (FileNotFoundException e) {
            logger.fatal("an Error has occured " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            logger.fatal("an Error has occured " + e.getMessage());

        } finally {

        }
        return annotationsMap;
    }
}
