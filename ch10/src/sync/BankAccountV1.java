package sync;

import utils.MyLogger;

public class BankAccountV1 implements BankAccount {
    private int balance;

    public BankAccountV1(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdraw(int amount) {
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

    @Override
    public int getBalance() {
        return balance;
    }
}
