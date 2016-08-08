import java.util.Scanner;

/**
 * Created by webonise on 8/8/16.
 */
public abstract class SocialMedia {
    String email;
    String hash;
    String type;

    boolean login(){
        Scanner scan = new Scanner(System.in);

        System.out.print("E-mail: ");
        String email = scan.next();

        System.out.print("Password: ");
        String password = scan.next();
        // check DB.

        this.email = email;
        return true;
    };
}
