package sync.lock;

import utils.MyLogger;

import java.util.concurrent.locks.LockSupport;

public class LockSupportMainv2 {
    //db  c r ud  commit, rollback
    public static void main(String[] args) throws InterruptedException {
        Thread thread01 = new Thread(new ParkTask(),"thread01");
        thread01.start();
        Thread.sleep(1000);
        MyLogger.log("thread01 state : "+thread01.getState());
        MyLogger.log("main - > unpark(thread01)");
        //LockSupport.unpark(thread01);
        //thread01.interrupt();

    }
    static class ParkTask implements Runnable {

        @Override
        public void run() {
            MyLogger.log("park시작, 2초 대기");
            LockSupport.parkNanos(2_000_000000);   //1sec = 1000ms   1ms = 1,000,000ns   2sec = 2,000,000,000
            //알람맞추기...
            MyLogger.log("park 종료 , state : "+Thread.currentThread().getState());
            MyLogger.log("인터럽트 상태 : "+Thread.currentThread().isInterrupted());
        }
    }
}
