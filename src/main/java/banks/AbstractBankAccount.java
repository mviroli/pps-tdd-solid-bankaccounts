package banks;

public abstract class AbstractBankAccount implements BankAccount {
    protected int balance = 0;

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    @Override
    public void withdraw(int amount) {
        this.checkWithdrawValidity(amount);
        this.balance = this.balance - amount - this.getFee();
    }

    protected abstract int getFee();

    protected abstract void checkWithdrawValidity(int amount);
}
