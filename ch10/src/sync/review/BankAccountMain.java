package sync.review;

import static utils.MyLogger.log;

public class BankAccountMain {
    public static void main(String[] args) throws InterruptedException {
        //BankAccount account = new BankAccountV1(10000);
        //BankAccount account = new BankAccountV2(10000);
        //BankAccount account = new BankAccountV3(10000);
        //BankAccount account = new BankAccountV4(10000);
        //BankAccount account = new BankAccountV5(10000);
        BankAccount account = new BankAccountV6(10000);

        Thread thread01 = new Thread(new WithdrawTask(account,8000),"thread01");
        Thread thread02 = new Thread(new WithdrawTask(account,8000),"thread02");
        thread01.start();
        thread02.start();
        Thread.sleep(2000);
        log("thread01 state : "+thread01.getState());
        log("thread02 state : "+thread01.getState());
        thread01.join();
        thread02.join();
        log("최종잔액 : "+account.getBalance());
    }
}
