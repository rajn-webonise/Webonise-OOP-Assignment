/**
 * Created by webonise on 9/8/16.
 */

import Mobile.*;

import java.util.ArrayList;
import java.util.List;

public class MainActivity {

    public static void main(String[] args){

        UI myUI = new UI("Android", "Sony", "7276485");
        init();

        while(true){
            myUI.display();
        }
        
    }

    static void init(){
        UI.world.add( new UI("Android", "Lenovo", "100") );
        UI.world.add( new UI("Android", "Asus", "999") );
        UI.world.add( new UI("iOS", "Apple", "512") );
        UI.world.add( new UI("Android", "Asus", "666") );
    }


}
