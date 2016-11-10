package ro.isr.devschool.designpatterns.behavioural.command;

/**
 * Created by Alex Dragan on 11/10/2016.
 */
public class BuyStock implements Order {

    private Stock actionStock;

    public BuyStock(Stock actionStock){
        this.actionStock = actionStock;
    }

    @Override
    public void execute() {
        actionStock.buy();
    }
}
