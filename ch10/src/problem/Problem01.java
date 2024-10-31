package problem;

public class Problem01 {
    public static void main(String[] args) {
//        Thread thread = new Thread(new MyTask());
//        thread.start();
        Thread thread = new MyTask02();
        thread.start();


    }
    static class MyTask implements Runnable {

        @Override
        public void run() {
            for(int i=0;i<5;i++) {
                System.out.println("Hello from Thread "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    static class MyTask02 extends Thread {
        @Override
        public void run() {
            for(int i=0;i<5;i++) {
                System.out.println("Hello from Thread "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
