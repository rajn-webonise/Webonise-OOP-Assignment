import java.util.List;

/**
 * Created by webonise on 8/8/16.
 */
public class Twitter extends SocialMedia {

    String tweet;
    List<Integer> follower;
    List<Integer> following;
    List<String> previous_tweets;

    Twitter(){
        type = "Twitter";
        System.out.println("Login via " + type + ": \n");

    }

}
