import utils.MyLogger;

public class ThreadInfoMain {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread(); //main thread
        MyLogger.log("mainThread = "+mainThread);
        MyLogger.log("mainThread.threadId() = "+mainThread.threadId());
        MyLogger.log("mainThread.getName() = "+mainThread.getName());
        MyLogger.log("mainThread.getPriority() = "+mainThread.getPriority());
        MyLogger.log("mainThread.getThreadGroup() = "+mainThread.getThreadGroup());
        MyLogger.log("mainThread.getState() = "+mainThread.getState());
        //main thread는 자동 시작
        System.out.println("========================");
        Thread myThread = new Thread(new HelloRunnable(),"myThread");
        myThread.start();
        MyLogger.log("myThread = "+myThread);
        MyLogger.log("myThread.threadId() = "+myThread.threadId());
        MyLogger.log("myThread.getName() = "+myThread.getName());
        MyLogger.log("myThread.getPriority() = "+myThread.getPriority());
        MyLogger.log("myThread.getThreadGroup() = "+myThread.getThreadGroup());
        MyLogger.log("myThread.getState() = "+myThread.getState());
    }
}
