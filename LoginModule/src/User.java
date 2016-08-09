import SocialMedia.SocialMedia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by webonise on 8/8/16.
 */
public class User {

    String email;
    String hash;
    String app_name;
    List<SocialMedia> social_media_logins = new ArrayList<SocialMedia>(); // List of websites a user has logged in via.

    // User created through social media login
    User(SocialMedia social_media, String app_name) {
        System.out.println("Welcome user " + social_media.email + "! [Logged in via " + social_media.type + "]");
        email = social_media.email;
        app_name = app_name;
        social_media_logins.add(social_media);
    }

    // User created through normal login
    User(String email, String app_name){
        this.email = email;
        app_name = app_name;
        System.out.println("Welcome user " + email + "!");
    }

    // Displays currently logged in users.
    static void logged_in_users_display(List<User> users){

        System.out.print("List of logged in users: ");
        for(int i=0;i<users.size();i++){
            System.out.print( users.get(i).email);
            if(users.get(i).social_media_logins.size()>0){
                System.out.print("[" + users.get(i).social_media_logins.get(0).type + "]");
            }

            System.out.print(", ");
        }


    }

}
