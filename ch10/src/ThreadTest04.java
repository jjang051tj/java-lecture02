import utils.MyLogger;

class PrintWorker implements Runnable {
    private String content;
    private int sleepMs;

    public PrintWorker(String content, int sleepMs) {
        this.sleepMs = sleepMs;
        this.content = content;
    }

    @Override
    public void run() {
        while (true) {
            MyLogger.log(content);
            try {
                Thread.sleep(sleepMs);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadTest04 {
    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintWorker("A",1000),"Thread-A");
        Thread threadB = new Thread(new PrintWorker("B",500),"Thread-B");
        threadA.start();
        threadB.start();
    }
}
