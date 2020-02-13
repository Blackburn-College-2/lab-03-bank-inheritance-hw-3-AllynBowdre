package emptyjavaproject;

/**
 *
 * @author allyn
 */
public class Money {

    private Currency currency;
    private double amount;

    public Money(Currency c, double a) {
        this.currency = c;
        this.amount = a;
    }

    
    public long getAmount() {
        return (long) amount;
    }

    
    public long setAmountNeg() {
        return -(long)amount;
    }

    
    public String getAmountString() {
        return amount + "";
    }

    
    public Money subtract(Money input) {
        long newAmount = (long)this.amount - input.getAmount();
        this.amount = newAmount;
        Money subtractedAmount = new Money(currency, newAmount);
        return subtractedAmount;
    }

    
    public Money add(Money input) {
        long newAmount = (long)this.amount + input.getAmount();
        this.amount = newAmount;
        Money sum = new Money(currency, newAmount);
        return sum;
    }

    @Override
    public String toString() {
        return "" + currency + amount;
    }
}
