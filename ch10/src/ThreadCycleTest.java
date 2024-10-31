import utils.MyLogger;

public class ThreadCycleTest {
    public static void main(String[] args) throws InterruptedException {
        //쓰레드의 상태
        Thread thread = new Thread(new MyRunnable(),"myThread"); //start
        MyLogger.log("myThread.state01 = "+thread.getState());
        MyLogger.log("myThread.start()");
        thread.start();
        Thread.sleep(1000);
        MyLogger.log("myThread.state03 = "+thread.getState());
        Thread.sleep(4000);
        MyLogger.log("myThread.state005 = "+thread.getState());
        MyLogger.log("end()");
    }
    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            //생명주기 life cycle
            try {
                MyLogger.log("start");
                MyLogger.log("myThread.state02 = "+Thread.currentThread().getState());
                MyLogger.log("sleep() start");
                Thread.sleep(3000);
                MyLogger.log("sleep() end");
                MyLogger.log("myThread.state04 = "+Thread.currentThread().getState());
                MyLogger.log("end()");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
