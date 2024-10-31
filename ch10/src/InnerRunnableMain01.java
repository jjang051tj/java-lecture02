//inner class 로 thread 만들기...
public class InnerRunnableMain01 {
    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+ " : run()");
        }
    }
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }

}
