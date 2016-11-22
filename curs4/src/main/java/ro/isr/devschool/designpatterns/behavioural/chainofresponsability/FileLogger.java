package ro.isr.devschool.designpatterns.behavioural.chainofresponsability;

/**
 * Created by Mihai MOGOS on 03/11/16.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Logging to file: "+message);
    }
}
