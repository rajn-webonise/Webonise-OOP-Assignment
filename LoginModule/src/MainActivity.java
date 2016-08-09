import java.util.ArrayList;
import java.util.List;

/**
 * Created by webonise on 8/8/16.
 */
public class MainActivity {

    public static void main(String[] args){

        MyApp my_webonise_app = new MyApp("Webonator Social");

        while(true){

            my_webonise_app.logged_in_users.add( my_webonise_app.login());
            User.logged_in_users_display(my_webonise_app.logged_in_users);

        }

    }

}
