class MyRunnable01 implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
    }
    //NEW, RUNNABLE, WAITING,TIMED_WATING,BLOCK,TERMINATED
}


class MyThread01 extends Thread {
    @Override
    public void run() {
        for(int i=0;i<500;i++) {
            System.out.println("-");
        }
    }
}
class MyThread02 extends Thread {
    @Override
    public void run() {
        for(int i=500;i<1000;i++) {
            System.out.println("|");
        }
    }
}


public class Test {
    public static void main(String[] args) {
//        for(int i=0;i<1000;i++) {
//            System.out.println("-");
//        }
//        Thread thread01= new MyThread01();
//        thread01.start();
//
//        Thread thread02= new MyThread02();
//        thread02.start();

        Thread thread03 = new Thread(new MyRunnable01());
        thread03.start();
        thread03.interrupt();
        thread03.start();
    }
}
