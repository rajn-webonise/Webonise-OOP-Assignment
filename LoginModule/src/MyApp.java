/**
 * Created by webonise on 8/8/16.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyApp {

    String name;
    List<User> logged_in_users = new ArrayList<User>();

    MyApp(String name){
        this.name = name;
    }

    User login(){
        User user = null;
        Scanner scan = new Scanner(System.in);

        System.out.println("\n\nLogin into the " + name + " system: \n" +
                "1. Login via " + name +
                "\n2. Login via Facebook" +
                "\n3. Login via Twitter" +
                "\n4. Login via GitHub");

        int login_method = scan.nextInt();

        if(login_method==1){
            System.out.print("E-mail: ");
            String email = scan.next();

            System.out.print("Password: ");
            String password = scan.next();

            // check in DB.
            user = new User(email, this.name);
            return user;
        }
        else{
            SocialMedia social_media = null;

            if(login_method==2)
                social_media= new Facebook();
            else if(login_method==3)
                social_media = new Twitter();
            else if(login_method==4)
                social_media = new Github();
            else{
                System.out.println("Invalid input. Try again?");
                return login();
            }



            user = new User(social_media, this.name);
            return user;
        }



    }


}
