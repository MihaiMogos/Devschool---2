package ro.isr.deveschool.atm.transaction;

import ro.isr.deveschool.atm.BankDatabase;
import ro.isr.deveschool.atm.Screen;

public class BalanceInquiry extends Transaction {

    public BalanceInquiry(int accountNumber, Screen screen, BankDatabase bankDatabase) {
        super(accountNumber, screen, bankDatabase);
    }

    @Override
    public void execute() {
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());

        screen.displayMessageLine("\nBalance Information:");
        screen.displayMessage("\n - Total balance:     ");
        screen.displayDollarAmount(totalBalance);
        screen.displayMessageLine("");
    }
}