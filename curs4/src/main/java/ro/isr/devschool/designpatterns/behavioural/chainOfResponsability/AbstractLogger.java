package ro.isr.devschool.designpatterns.behavioural.chainOfResponsability;

/**
 * Created by Mucefix on 03/11/16.
 */
public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //next element in chain of responsability
    protected  AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if( this.level <= level ){
            write(message);
        }
        if( nextLogger != null ){
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);

}
