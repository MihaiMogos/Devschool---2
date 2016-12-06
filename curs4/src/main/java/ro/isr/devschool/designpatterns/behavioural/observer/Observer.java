package ro.isr.devschool.designpatterns.behavioural.observer;

/**
 * Created by Mihai MOGOS on 10/11/16.
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
