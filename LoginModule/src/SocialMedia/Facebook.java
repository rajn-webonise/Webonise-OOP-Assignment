package SocialMedia;

import java.util.List;

/**
 * Created by webonise on 8/8/16.
 */
public class Facebook extends SocialMedia {
    String status;
    List<Integer> friendsID;
    String birthday;

    public Facebook(){
        super();
        type = "Facebook";
    }

}
