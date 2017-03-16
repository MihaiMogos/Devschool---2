package ro.isr.deveschool.atm;

public class CashDispenser {
    private final static int INITIAL_BILLS = 50;
    private int availableBills;
    public CashDispenser() {
        availableBills = INITIAL_BILLS;
    }

    public void dispenseCash(int amount) {
        int billsRequired = amount / 20;
        availableBills -= billsRequired;
    }

    public boolean hasSufficientBills(int amount) {
        int billsRequired = amount / 20;
        return (availableBills>=billsRequired);
    }
}