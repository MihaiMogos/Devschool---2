package ro.isr.devschool.designpatterns.creational.singleton;

/**
 * Created by Mihai MOGOS on 03/11/16.
 */
public class Singleton {

    private static Singleton instance;

    //make constructor private so that it cannot be called from outside
    //the class
    private Singleton(){}

    public static Singleton getInstance(){
        if( instance == null ){
            instance = new Singleton();
        }
        return instance;
    }

}
