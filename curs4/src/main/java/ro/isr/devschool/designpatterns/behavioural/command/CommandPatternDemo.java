package ro.isr.devschool.designpatterns.behavioural.command;

/**
 * Created by Alex Dragan on 11/10/2016.
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock actionStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(actionStock);
        SellStock sellStockOrder = new SellStock(actionStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
