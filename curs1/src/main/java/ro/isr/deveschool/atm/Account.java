package ro.isr.deveschool.atm;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(of = ("accountNumber"))
public class Account {
    @Getter private int accountNumber;
    private int pin;
    @Getter private double totalBalance; // funds available + pending deposits

    public Account(int accountNumber, int pin, double totalBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.totalBalance = totalBalance;
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
        totalBalance -= amount;
    }

}