//public,protected,default,private

class Bank {
    private int balance;

    public Bank() {
        balance = 0;
    }
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance+=amount;
        } else {
            System.out.println("금액이 유효하지 않습니다.");
        }
    }
    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance - amount>=0) {
            balance-=amount;
        } else {
            System.out.println("유효하지 않거나 잔액이 부족합니다.");
        }
    }
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }


    public int getBalance() {
        return balance;
    }
}
class Counter {
    private int count;
    private int max;

    public Counter(int max) {
        this.max = max;
    }
    public void increment() {
        if(count>=max) {
            System.out.println("설정한 최대값 "+max+"를 초과할 수 없습니다.");
            return;
        }
            count++;

    }
    public int getCount() {
        return count;
    }
}
public class Access {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        myBank.deposit(10000);
        myBank.withdraw(1000);
        myBank.withdraw(10000);
        System.out.println(myBank.getBalance());

        Counter counter = new Counter(4);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println(counter.getCount());

    }
}
