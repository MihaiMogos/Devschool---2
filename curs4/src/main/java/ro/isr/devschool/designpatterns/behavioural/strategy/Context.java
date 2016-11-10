package ro.isr.devschool.designpatterns.behavioural.strategy;

import lombok.Setter;

/**
 * Created by Alex Dragan on 11/10/2016.
 */
public class Context {

    @Setter
    public Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int numberOne, int numberTwo){
        return strategy.doOperation(numberOne, numberTwo);
    }
}
