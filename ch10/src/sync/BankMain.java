package sync;

import utils.MyLogger;

//동시성 문제...
public class BankMain {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccountV1(10000);
        Thread thread01 = new Thread(new WithdrawTask(bankAccount,8000),"thread01"); //삼성생명
        Thread thread02 = new Thread(new WithdrawTask(bankAccount,8000),"thread02"); //동양생명
        thread01.start();
        thread02.start();
        Thread.sleep(1000);
        MyLogger.log("thread01 state : "+thread01.getState());
        MyLogger.log("thread02 state : "+thread02.getState());
        thread01.join();
        thread02.join();
        MyLogger.log("최종 잔액 : "+bankAccount.getBalance());
    }
}
