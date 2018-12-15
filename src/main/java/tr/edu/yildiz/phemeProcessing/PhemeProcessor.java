package tr.edu.yildiz.phemeProcessing;

import com.fasterxml.jackson.databind.*;
import org.apache.commons.lang.StringUtils;
import tr.edu.yildiz.phemeProcessing.pojos.Annotations;
import tr.edu.yildiz.phemeProcessing.pojos.Tweet;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PhemeProcessor {


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
            System.out.println("Finished importing main annotations file");
            System.out.println("number of annotations imported: " + annotationsList.size());
            System.out.println("First annotation imported is: " + annotationsList.get(0).toString());
            System.out.println("Last annotation imported: " + annotationsList.get(annotationsList.size() - 1).toString());
            phemeProcessor.readMainTweet(annotationsList.get(0));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
            System.out.println("Finished importing main Tweet file");
            System.out.println("Main Tweet JSON file");
            System.out.println(mainTweet.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("Number of Favs");
        System.out.println(mainTweet.getFavoriteCount());
        System.out.print("Number of Retweets");
        System.out.println(mainTweet.getRetweetCount());
        return mainTweet;

    }
}
