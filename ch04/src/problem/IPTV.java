package problem;

public class IPTV extends ColorTV {
    private String ip;
    IPTV() {
        super(32,1024);
        ip = "127.0.0.1";
    }

    IPTV(String ip) {
        super(32, 1024);
        this.ip = ip;
    }

    IPTV(String ip, int size, int colorNum) {
        super(size, colorNum);
        this.ip = ip;
    }

    public void printProperty() {
        //부모꺼 호출할땐   super
        //내꺼 호출 할때는  this
        System.out.print("나의 IPTV는 ip는 "+ip+"주소의 ");
        printProperty();
    }
}
