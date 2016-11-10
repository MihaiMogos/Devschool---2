package ro.isr.devschool.designpatterns.behavioural.command;

/**
 * Created by Mucefix on 10/11/16.
 */
public class SellStock implements Order {

    private Stock actionStock;

    public SellStock(Stock actionStock){
        this.actionStock = actionStock;
    }

    public void execute(){
        this.actionStock.sell();
    }

}