import utils.MyLogger;

public class ThreadSleep {
    static class CountThread extends Thread {
        @Override
        public void run() {
            for(int i=0;i<10;i++) {
                MyLogger.log("value : "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //System.out.println(i);
            }
        }
    }


    static class CountThread02 implements Runnable  {
        @Override
        public void run() {
            for(int i=0;i<10;i++) {
                MyLogger.log("value : "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        CountThread countThread = new CountThread();
        Thread countThread02 = new Thread(new CountThread02(),"counter");
        //countThread.run()은 새로운 스레드가 만들지 않고 현재 스레드에서 실행된다.
        //countThread.start()은 새로운 스레드를 만들고 run()메서드를 실행한다.
        //countThread.start(); //start()메서드는 run을 실행해주는 메서드이다.
        countThread02.start();

        //여기다가 직접 만들어 보기...
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++) {
                    MyLogger.log("value : "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //System.out.println(i);
                }
            }
        };
        Thread thread02 = new Thread(runnable,"counter02");
        thread02.start();
        Thread thread03 =  new Thread(() -> {
            for(int i=0;i<10;i++) {
                MyLogger.log("value : "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //System.out.println(i);
            }
        },"counter03");
        thread03.start();
    }
}
