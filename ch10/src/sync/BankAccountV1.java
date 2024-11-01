package sync;

import utils.MyLogger;

public class BankAccountV1 implements BankAccount {
    private int balance;
    public BankAccountV1(int balance) {
        this.balance = balance;
    }
    //임계영역  critical section  여러개의 스레드가 동시에 접근하면 문제가 생길만한 영역
    /*
    @Override
    public synchronized boolean withdraw(int amount) {
        MyLogger.log("거래 시작 : "+ this.getClass().getSimpleName()  );
        MyLogger.log("[검증 시작] 출금액 "+amount+", 잔액 : "+balance);
        if(balance<amount){
            MyLogger.log("[검증 실패] 출금액 "+amount+", 잔액 : "+balance);
            return false;
        }
        MyLogger.log("[검증 완료] 출금액 "+amount+", 잔액 : "+balance);
        try {
            Thread.sleep(1000);
            balance = balance - amount;
            MyLogger.log("[출금 완료] 출금액 "+amount+", 변경 잔액 : "+balance);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        MyLogger.log("거래 종료");
        return true;
    }
     */
    @Override
    public boolean withdraw(int amount) {
        MyLogger.log("거래 시작 : "+ this.getClass().getSimpleName()  );
        synchronized (this) {
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
        }
        MyLogger.log("거래 종료");
        return true;
    }
    //하나의 스레드만 실행 가능한 상태로 만든다.
    @Override
    public synchronized int getBalance() {
        return balance;
    }
}
