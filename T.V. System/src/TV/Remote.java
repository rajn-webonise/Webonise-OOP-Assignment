package TV;

import Cable.Channel;

import java.util.List;
import java.util.Scanner;

/**
 * Created by webonise on 9/8/16.
 */
public class Remote {

    TV tv_set;

    public Remote(TV tv){
        tv_set = tv;
    }


    public void set_volume(){

        System.out.println("Set new volume: ");
        Scanner reader = new Scanner(System.in);
        int new_value = reader.nextInt();

        tv_set.setVolume(new_value);
    }

    public void change_volume(int change_value){
        tv_set.setVolume(tv_set.getVolume() + change_value);
    }


    public void set_channel(){
        System.out.println("Set new channel: ");
        Scanner reader = new Scanner(System.in);
        int new_value = reader.nextInt();
        boolean exists=false;
        List<Channel> channels = tv_set.cable.getChannels();
        for(Channel c:channels)
            if(c.getChannelId()==new_value)
                exists=true;


        if(exists==false) {
            System.out.println("Channel ID doesn't exist! Try again?");
            return;
        }

        tv_set.setChannel(new_value);
    }

    public void change_channel(int change_value){

        int current_channel_id = tv_set.getChannel();
        List<Channel> channels = tv_set.cable.getChannels();

        for(int i=0;i<channels.size();i++){
            if(channels.get(i).getChannelId()==current_channel_id){
                if(change_value==-1 && i>0)
                    change_value = channels.get(i-1).getChannelId();
                else if(change_value==1 && i!=channels.size()-1)
                    change_value = channels.get(i+1).getChannelId();
                else
                    change_value = current_channel_id;
            }
        }

        tv_set.setChannel(change_value);
    }


    public void displayOptions(){

        System.out.println("1. Set volume | 2. Volume +1 | 3. Volume -1" +
                            "\n4. Set channel | 5. Channel +1 | 6. Channel -1");

        Scanner reader = new Scanner(System.in);
        int choice = reader.nextInt();

        switch(choice){

            case 1:
                set_volume();
                break;
            case 2:
                change_volume(1);
                break;
            case 3:
                change_volume(-1);
                break;
            case 4:
                set_channel();
                break;
            case 5:
                change_channel(1);
                break;
            case 6:
                change_channel(-1);
                break;
        }

    }

}
