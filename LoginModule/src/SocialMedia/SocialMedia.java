package SocialMedia;

import java.util.Scanner;

/**
 * Created by webonise on 8/8/16.
 */
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

        // check DB.

        this.email = email;
        this.hash = password;

    }
}
