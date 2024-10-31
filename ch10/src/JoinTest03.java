import utils.MyLogger;

public class JoinTest03 {
    public static void main(String[] args) throws InterruptedException {
        MyLogger.log("계산 시작");
        SumTask sumTask01 = new SumTask(1,50);
        Thread thread01 = new Thread(sumTask01,"thread01");
        thread01.start();
        MyLogger.log("join() - main 쓰레드가 thread01 종료될때까지 1초 대기");
        thread01.join(1000);
        MyLogger.log("main 쓰레드 대기 종료");
        MyLogger.log("sumTask01.result === "+sumTask01.result);
        int sumAll = sumTask01.result;
        MyLogger.log("end");
    }
    static class SumTask implements Runnable {
        int startNum;
        int endNum;
        int result = 0;
        public SumTask(int startNum, int endNum) {
            this.startNum = startNum;
            this.endNum = endNum;
        }
        @Override
        public void run() {
            MyLogger.log("작업시작");
            try {
                Thread.sleep(2000);
                int sum = 0;
                for(int i=startNum;i<=endNum;i++) {
                    sum+=i;
                }
                result = sum;
                MyLogger.log("작업 완료 result === "+result);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
