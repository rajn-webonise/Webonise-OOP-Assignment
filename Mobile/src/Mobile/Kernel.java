package Mobile;

import java.util.List;

/**
 * Created by webonise on 9/8/16.
 */
public class Kernel {

    String name;
    List<BaseApp> appsRunning;


    Kernel(String name){
        this.name = name;
    }

    void memory_write(String data){
        // Hardware level code.
    }


}
