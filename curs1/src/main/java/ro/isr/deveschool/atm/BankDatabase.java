package ro.isr.deveschool.atm;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankDatabase {
    private List<Account> accounts = new ArrayList<>();

    public BankDatabase() {
        accounts.add(new Account(12345, 54321, 1000.0));
        accounts.add(new Account(98765, 56789, 200.0));
    }

    private Account getAccount(int accountNumber) {
        return accounts.stream().filter(x -> x.getAccountNumber() == accountNumber).findFirst().orElse(null);
    }

    public boolean authenticateUser(int userAccountNumber, int userPIN) {
        Account userAccount = getAccount(userAccountNumber);
        if (userAccount != null) {
            return userAccount.validatePIN(userPIN);
        } else {
            return false;
        }
    }

    public double getTotalBalance(int userAccountNumber) {
        return getAccount(userAccountNumber).getTotalBalance();
    }
    public void credit(int userAccountNumber, double amount) {
        getAccount(userAccountNumber).credit(amount);
    }
    public void debit(int userAccountNumber, double amount) {
        getAccount(userAccountNumber).debit(amount);
    }
}