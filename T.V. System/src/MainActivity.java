/**
 * Created by webonise on 9/8/16.
 */

import Cable.*;
import TV.*;

import java.util.Scanner;

public class MainActivity {

    public static void main(String[] args){

        Cable TataSky = new Cable("TataSky");

        TataSky.addChannel(1, "Sony");
        TataSky.addChannel(5, "HBO");
        TataSky.addChannel(12, "Colors");
        TataSky.addChannel(300, "Discovery Channel");
        TataSky.addChannel(15, "BBC");

        TV my_tv = new TV(TataSky);

        Remote remote = new Remote(my_tv);

        while(true){
            my_tv.display();
            remote.displayOptions();
        }


    }
}
