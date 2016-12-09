package ro.isr.devschool.designpatterns.behavioural.strategy;

/**
 * Created by Mihai MOGOS on 10/11/16.
 */
public class OperationSubstract implements Strategy {

    @Override
    public int doOperation(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }
}
