package ro.isr.devschool.designpatterns.behavioural.chainofresponsability;


/**
 * Created by Mucefix on 03/11/16.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Writing to the console: "+ message);
    }

}
