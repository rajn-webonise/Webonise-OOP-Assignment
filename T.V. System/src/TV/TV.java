package TV;

/**
 * Created by webonise on 9/8/16.
 */

import Cable.*;

public class TV {

    public Screen screen;
    Cable cable;

    private int current_volume;
    private int current_channel_id;


    public TV(Cable cable) {
        this.cable = new Cable(cable);
        this.screen = new Screen();
        this.current_channel_id = this.cable.getChannels().get(0).getChannelId();
        this.current_volume = 0;
    }

    void setVolume(int new_value){
        System.out.println("Volume changed from " + current_volume + " to " + new_value);
        current_volume = new_value;

    }

    int getVolume(){
        return current_volume;
    }

    public void setChannel(int new_value){
        System.out.println("Requesting channel#" + new_value + " from Cable provider " + cable.getCableProviderName());
        cable.streamChannel(new_value);
        System.out.println("Channel changed from " + current_channel_id + " to " + new_value);
        current_channel_id = new_value;
    }

    int getChannel(){
        return current_channel_id;
    }

    public void display(){
        screen.display(cable, current_channel_id);
    }


}

