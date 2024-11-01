package sync;

public class SyncTestBadMain {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable task =  new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++) {
                    counter.increment();
                }
            }
        };
        Thread thread01 = new Thread(task);
        Thread thread02 = new Thread(task);
        thread01.start();
        thread02.start();
        thread01.join();
        thread02.join();
        System.out.println("결과 : "+counter.getCount());
    }
    static class Counter {
        private int count = 0;
        public void increment() {
            count+=1;
        }

        public int getCount() {
            return count;
        }
    }
}
