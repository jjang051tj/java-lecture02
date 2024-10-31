import utils.MyLogger;

public class ThreadStop01 {
    public static void main(String[] args) throws InterruptedException {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask,"myTask");
        thread.start();
        Thread.sleep(4000);
        MyLogger.log("작업멈춤 지시");
        myTask.isFlag = false;
        //1. 상태변수를 사용해서 무한 루프의 스레드 빠져 나가기...
    }
    static class MyTask implements Runnable {
        boolean isFlag = true;
        @Override
        public void run() {
            int i=0;
            while(isFlag) {
                i++;
                MyLogger.log("현재 작업중  == "+i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            MyLogger.log("자원정리 하기");
            MyLogger.log("작업 종료");
        }
    }
}
