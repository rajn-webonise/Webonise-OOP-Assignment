import java.util.List;

/**
 * Created by webonise on 8/8/16.
 */
public class User {

    String email;
    String hash;
    List<SocialMedia> social_media_logins;

    User(SocialMedia social_media) {
        System.out.println("Welcome user " + social_media.email + "! [Logged in via " + social_media.type + "]");
        social_media_logins.add(social_media);
    }

    User(String email){
        System.out.println("Welcome user " + email + "!");
    }

}
