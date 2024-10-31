package problem;

public class Problem03 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread01 = new Thread(new MyTask01());
        Thread thread02 = new Thread(new MyTask02());
        thread01.start();
        thread01.join();
        thread02.start();
    }
    static class MyTask01 implements Runnable {
        @Override
        public void run() {
            for(int i=0;i<3;i++) {
                System.out.println("Task 1 complete");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    static class MyTask02 implements Runnable {
        @Override
        public void run() {
            for(int i=0;i<3;i++) {
                System.out.println("Task 2 complete");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
