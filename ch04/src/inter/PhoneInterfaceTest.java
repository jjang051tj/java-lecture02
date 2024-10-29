package inter;

public class PhoneInterfaceTest {
    public static void main(String[] args) {
        //
        MusicPhoneInterface gallaxy = new GallaxyS24();
        gallaxy.printLogo();
        gallaxy.sendCall();
        gallaxy.receiveCall();
        gallaxy.sendSMS();
    }
}
