package Mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by webonise on 9/8/16.
 */
public class Messenger extends BaseApp {

    List<String> inbox = new ArrayList<String>();

    Messenger(){
        name = "Messenger";
    }

    public void displayOptions(){

        System.out.println("1. Send a message. | 2. Display inbox");
        Scanner reader = new Scanner(System.in);
        int option = reader.nextInt();

        if(option == 1){
            sendMessage();
        }
        else if(option == 2){
            checkInbox();
        }

    }

    void sendMessage(){

        System.out.println("Write a message: ");
        Scanner reader = new Scanner(System.in);
        String message = reader.nextLine();

        System.out.println("Deliver to?: (Available numbers)");
        for(int i=0;i<UI.world.size();i++)
            System.out.print(UI.world.get(i).handset.phone_number + " | ");


        String send_to = reader.nextLine();


        for(int i=0;i<UI.world.size();i++){

            if(send_to.equalsIgnoreCase(UI.world.get(i).handset.phone_number)){
                System.out.println("Sending message \"" + message +  "\" to " + send_to);
                UI.world.get(i).handset.messenger.getMessage(message);
            }

        }

    }

    public void getMessage(String message){
        inbox.add(message);
    }

    void checkInbox(){
        for(int i=0;i<inbox.size();i++)
            System.out.println("Message#" + (i+1) + ": " + inbox.get(i));
    }
}
