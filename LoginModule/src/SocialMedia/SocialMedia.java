package SocialMedia;

import java.util.Scanner;

/**
 * Created by webonise on 8/8/16.
 */

// Abstract class SocialMedia extended by every social media website like Facebook, GitHub, Twitter.
public abstract class SocialMedia {
    public String email;
    private String hash;
    public String type;

    protected SocialMedia(){
        Scanner scan = new Scanner(System.in);

        System.out.print("E-mail: ");
        String email = scan.next();

        System.out.print("Password: ");
        String password = scan.next();

        // check using DB connection. Logic not written here.

        this.email = email;
        this.hash = password;

    }
}
