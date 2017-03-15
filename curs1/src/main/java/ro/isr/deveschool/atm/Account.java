package ro.isr.deveschool.atm;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(of = ("accountNumber"))
public class Account {
    @Getter private int accountNumber;
    private int pin;
    @Getter private double availableBalance;
    @Getter private double totalBalance; // funds available + pending deposits

    public Account(int theAccountNumber, int thePIN,
                   double theAvailableBalance, double theTotalBalance) {
        accountNumber = theAccountNumber;
        pin = thePIN;
        availableBalance = theAvailableBalance;
        totalBalance = theTotalBalance;
    }

    // determines whether a user-specified PIN matches PIN in Account
    public boolean validatePIN(int userPIN) {
        if (userPIN == pin)
            return true;
        else
            return false;
    }

    public void credit(double amount) {
        totalBalance += amount;
    }

    public void debit(double amount) {
        availableBalance -= amount;
        totalBalance -= amount;
    }

}