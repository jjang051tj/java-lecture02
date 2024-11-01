package sync;

import utils.MyLogger;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountV2 implements BankAccount {
    private final Lock lock = new ReentrantLock();
    private int balance;
    public BankAccountV2(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdraw(int amount) {
        MyLogger.log("거래 시작 : "+ this.getClass().getSimpleName()  );
        lock.lock(); //잠그기 다른 애들 못들어오게...
         try{
            MyLogger.log("[검증 시작] 출금액 " + amount + ", 잔액 : " + balance);
            if (balance < amount)  {
                MyLogger.log("[검증 실패] 출금액 " + amount + ", 잔액 : " + balance);
                return false;
            }
            MyLogger.log("[검증 완료] 출금액 " + amount + ", 잔액 : " + balance);
            try {
                Thread.sleep(1000);
                balance = balance - amount;
                MyLogger.log("[출금 완료] 출금액 " + amount + ", 변경 잔액 : " + balance);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } finally {
             lock.unlock();
        }
        MyLogger.log("거래 종료");
        return true;
    }
    //하나의 스레드만 실행 가능한 상태로 만든다.
    @Override
    public int getBalance() {
        //고급 기법
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }
}
