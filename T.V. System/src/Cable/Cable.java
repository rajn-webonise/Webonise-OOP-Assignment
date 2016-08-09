package Cable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by webonise on 9/8/16.
 */
public class Cable {

    String cable_provider;
    List<Channel> channels = new ArrayList<Channel>();

    public Cable(String name){
        cable_provider = name;
    }

    //safe-copy constructor
    public Cable(Cable c){
        this.cable_provider = c.cable_provider;
        this.cable_provider = c.cable_provider;
        for(Channel channel: c.channels) this.channels.add( new Channel(channel));

    }

    public void addChannel(int id, String name){
        Channel channel = new Channel(id, name);
        channels.add(channel);
    }

    public String getCableProviderName(){
        return cable_provider;
    }

    public void streamChannel(int channel_id){
        //logic for streaming.
        Channel c = getChannelById(channel_id);
        System.out.println("Streaming " + c.getChannelName() + " [ID:" + c.getChannelId() + "]" );
    }

    Channel getChannelById(int channel_id){
        for(int i=0;i<channels.size();i++){
            if(channels.get(i).getChannelId()==channel_id){
                return new Channel(channels.get(i));
            }
        }
        System.out.println("Channel not found. Crashing..." ); // IMPOSSIBLE.
        return null; // Should never happen.
    }

    public List<Channel> getChannels(){
        return channels;
    }


}
