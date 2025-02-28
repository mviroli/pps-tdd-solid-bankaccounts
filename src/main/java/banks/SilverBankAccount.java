package banks;

public class SilverBankAccount extends AbstractBankAccount {

    @Override
    protected int getFee() {
        return 1;
    }

    @Override
    protected void checkWithdrawValidity(int amount) {
        if (this.balance < amount){
            throw new IllegalStateException();
        }
    }
}
