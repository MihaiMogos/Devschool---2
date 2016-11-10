package ro.isr.devschool.designpatterns.behavioural.strategy;

/**
 * Created by Alex Dragan on 11/10/2016.
 */
public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
}
