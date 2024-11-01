package sync;

public interface BankAccount {
    boolean withdraw(int amount);  //출금
    int getBalance(); //잔고 조회
}
