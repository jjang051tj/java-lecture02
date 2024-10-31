import utils.MyLogger;

public class InnerRunnableMain02 {
    public static void main(String[] args) {
        MyLogger.log("main start()");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                MyLogger.log("run()");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        MyLogger.log("main end()");
    }
}
