import utils.MyLogger;

public class ThreadStop02 {
    public static void main(String[] args) throws InterruptedException {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask,"myTask");
        thread.start();
        Thread.sleep(4000);
        thread.interrupt(); // 바로 멈춤 지시를 할 수 있다.
        MyLogger.log("작업멈춤 지시");
        //1. 상태변수를 사용해서 무한 루프의 스레드 빠져 나가기...
    }
    static class MyTask implements Runnable {
        @Override
        public void run() {
            int i=0;
            try {
                while (true) {
                    i++;
                    MyLogger.log("작업중 === "+i);
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                MyLogger.log(Thread.currentThread().isInterrupted());
                MyLogger.log(e.getMessage());
                MyLogger.log(Thread.currentThread().getState());
            }
        }
    }
}
