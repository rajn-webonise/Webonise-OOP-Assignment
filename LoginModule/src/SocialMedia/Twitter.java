package SocialMedia;

import java.util.List;

/**
 * Created by webonise on 8/8/16.
 */
public class Twitter extends SocialMedia {

    String tweet;
    List<Integer> follower;
    List<Integer> following;
    List<String> previous_tweets;

    public Twitter(){
        super();
        type = "Twitter";

    }

}
