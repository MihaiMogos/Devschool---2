package ro.isr.devschool.designpatterns.behavioural.command;

/**
 * Created by Alex Dragan on 11/10/2016.
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [Name: "+name+" Quantity: "+quantity+" ] bought");
    }

    public void sell(){
        System.out.println("Stock [Name: "+name+" Quantity: "+quantity+" ] sold");
    }

}
