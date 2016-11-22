package ro.isr.devschool.designpatterns.behavioural.chainofresponsability;

/**
 * Created by Mihai MOGOS on 03/11/16.
 */
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Writing to error logger: "+message);
    }
}
