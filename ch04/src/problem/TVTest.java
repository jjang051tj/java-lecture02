package problem;

public class TVTest {
    public static void main(String[] args) {
        ColorTV colorTV = new ColorTV(70,2048);
        colorTV.printProperty();

        IPTV iptv01 = new IPTV();
        IPTV iptv02 = new IPTV("192.168.0.33");
        IPTV iptv03 = new IPTV("192.168.0.33",70,2048);
        iptv01.printProperty();
        iptv02.printProperty();
        iptv03.printProperty();
    }
}
