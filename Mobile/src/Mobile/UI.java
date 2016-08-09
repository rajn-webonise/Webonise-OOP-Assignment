package Mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by webonise on 9/8/16.
 */
public class UI {

    public static List<UI> world = new ArrayList<UI>();
    Handset handset;

    public UI(String kernel, String OEM, String phone_number){

        handset = new Handset(kernel, OEM, phone_number);
    }



    public void display(){
        System.out.println("\n\n---\nUnlocked device: ");
        displayOptions();


    }

    void displayOptions(){

        System.out.println("1. Call a number | 2. Messenger");
        Scanner reader = new Scanner(System.in);
        int option = reader.nextInt();

        if(option==1){
            this.handset.dialer.call(this.handset.phone_number);
        }
        else if(option==2){
            this.handset.messenger.displayOptions();
        }

    }


}
