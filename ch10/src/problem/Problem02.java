package problem;

public class Problem02 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyTask());
        thread.start();
    }
    static class MyTask implements Runnable {

        @Override
        public void run() {
            for(int i=0;i<5;i++) {
                System.out.println("Running in Runnable "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
