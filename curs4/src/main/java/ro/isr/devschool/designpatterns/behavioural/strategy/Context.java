package ro.isr.devschool.designpatterns.behavioural.strategy;

import lombok.Setter;

/**
 * Created by Mucefix on 10/11/16.
 */
public class Context {

    @Setter
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int numberOne, int numberTwo){
        return strategy.doOperation(numberOne, numberTwo);
    }

}
