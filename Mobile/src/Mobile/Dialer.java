package Mobile;

import java.util.Scanner;

/**
 * Created by webonise on 9/8/16.
 */
public class Dialer extends BaseApp {

    Dialer(){
        name = "Dialer";
    }

    void call(String calling_number){

        System.out.println("Call to? (Available numbers)");
        for(int i=0;i<UI.world.size();i++){
                System.out.print(UI.world.get(i).handset.phone_number + " | ");
        }

        Scanner reader = new Scanner(System.in);
        String number = reader.nextLine();

        for(int i=0;i<UI.world.size();i++){

            if(number.equalsIgnoreCase(UI.world.get(i).handset.phone_number)){
                recieve(calling_number);
                System.out.println("In call with " + number + ". Give any input to end call & continue.");
            }

        }

    }

    void recieve(String caller){
        System.out.println("Recieved call from " + caller);
    }
}
