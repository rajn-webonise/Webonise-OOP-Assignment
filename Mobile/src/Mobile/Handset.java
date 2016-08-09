package Mobile;

/**
 * Created by webonise on 9/8/16.
 */
public class Handset {

    Kernel kernel;
    String OEM;
    String phone_number;
    Messenger messenger = new Messenger();
    Dialer dialer = new Dialer();

    Handset(String kernel, String OEM, String phone_number){

        this.kernel = new Kernel(kernel);
        this.OEM = OEM;
        this.phone_number = phone_number;

    }


}
