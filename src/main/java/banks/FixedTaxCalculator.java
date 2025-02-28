package banks;

public class FixedTaxCalculator implements FeeCalculator {
    @Override
    public int getFee() {
        return 1;
    }
}
