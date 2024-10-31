import utils.MyLogger;

public class ManyThreadMain {
    public static void main(String[] args) {
        HelloRunnable helloRunnable = new HelloRunnable();
        MyLogger.log("main start()");
        for(int i=0;i<100;i++) {
            Thread thread = new Thread(helloRunnable);
            thread.start();
        }
        MyLogger.log("main end()");
    }
}
