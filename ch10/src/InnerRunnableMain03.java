import utils.MyLogger;

public class InnerRunnableMain03 {
    public static void main(String[] args) {
        MyLogger.log("main() start");

        Thread thread = new Thread(() -> MyLogger.log("run()"));
        thread.start();
        MyLogger.log("main() end");

    }
}
