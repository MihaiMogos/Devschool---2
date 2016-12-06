package ro.isr.devschool.designpatterns.behavioural.command;

/**
 * Created by Mihai MOGOS on 10/11/16.
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock actionStock = new Stock();

        Order buyStockOrder = new BuyStock(actionStock);
        Order sellStockOrder = new SellStock(actionStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}
