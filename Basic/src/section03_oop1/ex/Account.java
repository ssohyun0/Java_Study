package section03_oop1.ex;

public class Account {
    int balance; // 잔액

    int deposit(int amount){
        balance += amount;
        return balance;
    }

    int withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
        return balance;
    }

    void printBalance(){
        System.out.println("잔고 : " + balance);
    }
}
