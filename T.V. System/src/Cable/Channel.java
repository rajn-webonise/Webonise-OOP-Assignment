package Cable;

/**
 * Created by webonise on 9/8/16.
 */
public class Channel {

    private int channel_id;
    private String channel_name;

    Channel(int id, String name){
        channel_id = id;
        channel_name = name;
    }

    //safe-copy constructor
    Channel(Channel c){
        channel_id = c.channel_id;
        channel_name = c.channel_name;
    }

    public int getChannelId(){
        return channel_id;
    }


    public String getChannelName(){
        return channel_name;
    }


}
