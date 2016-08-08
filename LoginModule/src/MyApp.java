/**
 * Created by webonise on 8/8/16.
 */

import java.util.Scanner;

public class MyApp {

    String name;

    MyApp(String name){
        this.name = name;
    }

    User login(){
        User user = null;
        Scanner scan = new Scanner(System.in);

        System.out.println("Login into the " + name + " system: \n" +
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
            user = new User(email);
            return user;
        }
        else{
            SocialMedia social_media = null;
            if(login_method==2)
                social_media= new Facebook();
            else if(login_method==3)
                social_media = new Twitter();

            if(social_media.login()==true){
                user = new User(social_media);
                return user;
            }


            return user;

        }



    }


}
