import utils.MyLogger;

public class JoinTest01 {
    public static void main(String[] args) throws InterruptedException {
        MyLogger.log("계산 시작");
        SumTask sumTask01 = new SumTask(1,50);
        SumTask sumTask02 = new SumTask(51,100);
        Thread thread01 = new Thread(sumTask01,"thread01");
        Thread thread02 = new Thread(sumTask02,"thread02");
        thread01.start();
        thread02.start();

        MyLogger.log("main 스레드 sleep");
        Thread.sleep(3000);
        MyLogger.log("main 스레드 wake up");


        MyLogger.log("sumTask01.result === "+sumTask01.result);
        MyLogger.log("sumTask02.result === "+sumTask02.result);
        int sumAll = sumTask01.result+ sumTask02.result;
        MyLogger.log("sumTask01.result + sumTask02.result = "+sumAll);
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
                System.out.println("작업 완료 result === "+result);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
