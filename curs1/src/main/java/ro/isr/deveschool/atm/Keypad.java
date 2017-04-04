package ro.isr.deveschool.atm;

import java.util.Scanner;

public class Keypad {
    private Scanner input;

    public Keypad() {
        this.input = new Scanner(System.in);
    }
    public int getInput() {
        return input.nextInt();
    }
}