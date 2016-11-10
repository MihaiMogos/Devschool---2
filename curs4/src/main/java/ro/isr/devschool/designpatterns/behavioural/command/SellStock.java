package ro.isr.devschool.designpatterns.behavioural.command;

/**
 * Created by Alex Dragan on 11/10/2016.
 */
public class SellStock implements Order {

    private Stock actionStock;

    public SellStock(Stock actionStock){
        this.actionStock = actionStock;
    }

    @Override
    public void execute() {
        actionStock.sell();
    }
}
