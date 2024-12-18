package sync.review;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;
import static utils.MyLogger.log;

public class BankAccountV6 implements BankAccount {
    private int balance;
    private final Lock lock = new ReentrantLock();

    public BankAccountV6(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래시작 : " + this.getClass().getSimpleName());
        try {
            if(!lock.tryLock(500, TimeUnit.MILLISECONDS)) {
              log("[진입 실패] 이미 처리 중인 작업이 있습니다.");
              return false;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //lock.lock();
        try {
            log("[검증시작] 출금액 : " + amount + " , 잔액 : " + balance);
            if (balance < amount) {
                log("[검증실패] 출금액 : " + amount + " , 잔액 : " + balance);
                return false;
            }
            log("[검증완료] 출금액 : " + amount + " , 잔액 : " + balance);
            try {
                sleep(1000);
                balance = balance - amount;
                log("[출금완료] 출금액 : " + amount + " , 잔액 : " + balance);
                log("거래완료");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } finally {
            lock.unlock();
        }
        return true;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}
