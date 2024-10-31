import utils.MyLogger;

public class JoinTest04 {
    public static void main(String[] args) {
        Thread thread01 = new Thread(new MyTask(),"thread01");
        Thread thread02 = new Thread(new MyTask(),"thread02");
        Thread thread03 = new Thread(new MyTask(),"thread03");
        thread01.start();
        thread03.start();
    }
    static  class MyTask implements Runnable {

        @Override
        public void run() {
            for(int i=0;i<10;i++) {
                MyLogger.log(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
