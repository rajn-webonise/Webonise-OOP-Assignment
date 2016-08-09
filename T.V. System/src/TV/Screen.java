package TV;
import Cable.*;
/**
 * Created by webonise on 9/8/16.
 */
public class Screen {

    public void display(Cable cable, int currentID){
        System.out.println("Welcome to " + cable.getCableProviderName()+". Following is the list of channels you can browse:\n");

        for(Channel channel: cable.getChannels()){
            if(currentID == channel.getChannelId())
                System.out.println("ChannelID: " + channel.getChannelId() + " \t\tName:" + channel.getChannelName() + " \t\t[Currently watching]");
            else
                System.out.println("ChannelID: " + channel.getChannelId() + " \t\tName:" + channel.getChannelName());
        }
    }

}
