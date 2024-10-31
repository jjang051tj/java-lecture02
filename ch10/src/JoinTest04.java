import utils.MyLogger;

public class JoinTest04 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread01 = new Thread(new MyTask(),"thread01");
        Thread thread02 = new Thread(new MyTask(),"thread02");
        Thread thread03 = new Thread(new MyTask(),"thread03");

        thread01.start();
        thread01.join(); //join은 대기 상태로 만들어 준다.
        thread02.start();
        thread02.join();
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
