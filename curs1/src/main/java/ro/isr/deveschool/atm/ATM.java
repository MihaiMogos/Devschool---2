package ro.isr.deveschool.atm;

import ro.isr.deveschool.atm.transaction.BalanceInquiry;
import ro.isr.deveschool.atm.transaction.Deposit;
import ro.isr.deveschool.atm.transaction.Transaction;
import ro.isr.deveschool.atm.transaction.Withdrawal;

public class ATM {
    // constants corresponding to main menu options
    private static final int BALANCE_INQUIRY = 1;
    private static final int WITHDRAWAL = 2;
    private static final int DEPOSIT = 3;
    private static final int EXIT = 4;
    private boolean userAuthenticated;
    private int currentAccountNumber;
    private Screen screen;
    private Keypad keypad;
    private CashDispenser cashDispenser;
    private DepositSlot depositSlot;
    private BankDatabase bankDatabase;

    public ATM() {
        userAuthenticated = false;
        currentAccountNumber = 0;
        screen = new Screen();
        keypad = new Keypad();
        cashDispenser = new CashDispenser();
        depositSlot = new DepositSlot();
        bankDatabase = new BankDatabase();
    }

    public void run() {
        // welcome and authenticate user; perform transactions
        while (true) {
            // loop while user is not yet authenticated
            while (!userAuthenticated) {
                screen.displayMessageLine("\nWelcome!");
                authenticateUser();
            }
            performTransactions(); // user is now authenticated
            userAuthenticated = false; // reset before next ATM session
            currentAccountNumber = 0; // reset before next ATM session
            screen.displayMessageLine("\nThank you! Goodbye!");
            System.exit(0);
        }
    }

    private void authenticateUser() {
        screen.displayMessage("\nPlease enter your account number: ");
        int accountNumber = keypad.getInput();
        screen.displayMessage("\nEnter your PIN: ");
        int pin = keypad.getInput();

        userAuthenticated = bankDatabase.authenticateUser(accountNumber, pin);

        if (userAuthenticated) {
            currentAccountNumber = accountNumber;
        } else {
            screen.displayMessageLine("Invalid account number or PIN. Please try again.");
        }
    }

    // display the main menu and perform transactions
    private void performTransactions() {
        Transaction currentTransaction = null;
        boolean userExited = false;

        // loop while user has not chosen option to exit system
        while (!userExited) {
            int mainMenuSelection = displayMainMenu();
            switch (mainMenuSelection) {
                case BALANCE_INQUIRY:
                case WITHDRAWAL:
                case DEPOSIT:
                    currentTransaction = createTransaction(mainMenuSelection);
                    currentTransaction.execute();
                    break;
                case EXIT:
                    screen.displayMessageLine("\nExiting the system...");
                    userExited = true;
                    break;
                default:
                    screen.displayMessageLine("\nYou did not enter a valid selection. Try again.");
                    break;
            }
        }
    }

    private int displayMainMenu() {
        screen.displayMessageLine("\nMain menu:");
        screen.displayMessageLine("1 - View my balance");
        screen.displayMessageLine("2 - Withdraw cash");
        screen.displayMessageLine("3 - Deposit funds");
        screen.displayMessageLine("4 - Exit\n");
        screen.displayMessage("Enter a choice: ");
        return keypad.getInput();
    }

    private Transaction createTransaction(int type) {
        Transaction temp = null;

        switch (type) {
            case BALANCE_INQUIRY:
                temp = new BalanceInquiry(currentAccountNumber, screen, bankDatabase);
                break;
            case WITHDRAWAL:
                temp = new Withdrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
                break;
            case DEPOSIT:
                temp = new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depositSlot);
                break;
        }
        return temp;
    }
}