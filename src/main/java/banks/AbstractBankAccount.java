package banks;

public abstract class AbstractBankAccount {
    protected int balance = 0;

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        this.checkWithdrawValidity(amount);
        this.balance = this.balance - amount - this.getFee();
    }

    protected abstract int getFee();

    protected abstract void checkWithdrawValidity(int amount);
}
