package sync.review;

import static java.lang.Thread.sleep;
import static utils.MyLogger.log;

public class BankAccountV3 implements BankAccount {
    private int balance;

    public BankAccountV3(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdraw(int amount)  {
        log("거래시작 : "+this.getClass().getSimpleName());
        synchronized (this) {
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
        }
        return true;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}
