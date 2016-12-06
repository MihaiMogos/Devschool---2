package ro.isr.devschool.designpatterns.behavioural.strategy;

/**
 * Created by Mihai MOGOS on 10/11/16.
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("First execution: "+ context.executeStrategy(1,3));

        System.out.println("Changing to substraction ");
        context.setStrategy(new OperationSubstract());
        System.out.println("Second execution: "+ context.executeStrategy(1, 3));

        System.out.println("Changing to multiplication ");
        context.setStrategy(new OperationMultiply());
        System.out.println("Third execution: "+ context.executeStrategy(1, 3));



    }
}
