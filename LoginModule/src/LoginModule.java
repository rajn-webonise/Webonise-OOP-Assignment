import java.util.ArrayList;
import java.util.List;

/**
 * Created by webonise on 8/8/16.
 */
public class LoginModule {

    public static void main(String[] args){
        MyApp my_app = new MyApp("Webonator Social");


        while(true){

            my_app.logged_in_users.add( my_app.login());
            User.logged_in_users_display(my_app.logged_in_users);
        }

    }

}
