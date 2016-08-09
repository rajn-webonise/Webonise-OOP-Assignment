package SocialMedia;

import java.util.List;

/**
 * Created by webonise on 8/8/16.
 */
public class Github extends SocialMedia {

    List<String> repository_links;
    List<Integer> following;
    List<Integer> follower;

    public Github(){
        super();
        type = "Github";

    }
}
