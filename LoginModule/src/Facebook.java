import java.util.List;

/**
 * Created by webonise on 8/8/16.
 */
public class Facebook extends SocialMedia {
    String status;
    List<Integer> friendsID;
    String birthday;

    Facebook(){
        type = "Facebook";
        System.out.println("Login via " + type + ": \n");
    }

}
