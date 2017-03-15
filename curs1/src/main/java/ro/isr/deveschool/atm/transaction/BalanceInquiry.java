package ro.isr.deveschool.atm.transaction;

import ro.isr.deveschool.atm.BankDatabase;
import ro.isr.deveschool.atm.Screen;

public class BalanceInquiry extends Transaction {

    public BalanceInquiry(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase) {
        super(userAccountNumber, atmScreen, atmBankDatabase);
    }

    @Override
    public void execute() {
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        double availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());
        double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());

        screen.displayMessageLine("\nBalance Information:");
        screen.displayMessage(" - Available balance: ");
        screen.displayDollarAmount(availableBalance);
        screen.displayMessage("\n - Total balance:     ");
        screen.displayDollarAmount(totalBalance);
        screen.displayMessageLine("");
    }
}