import java.util.ArrayList;
import java.util.List;

/**
 * Created by webonise on 8/8/16.
 */
public class MainActivity {

    public static void main(String[] args){

        // Creation of an app object
        MyApp my_webonise_app = new MyApp("Webonator Social");

        while(true){
            // The UI thread. It shows currently logged in users, and allows more users to login at the same time.
            my_webonise_app.logged_in_users.add( my_webonise_app.login());
            User.logged_in_users_display(my_webonise_app.logged_in_users);

        }

    }

}
