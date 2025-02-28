package banks;

public class BankAccount {

    private int balance = 0;

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        if (this.balance < amount){
            throw new IllegalStateException();
        }
        this.balance = this.balance - amount - 1;
    }
}
