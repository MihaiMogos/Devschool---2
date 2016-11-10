package ro.isr.devschool.designpatterns.behavioural.observer;

/**
 * Created by Alex Dragan on 11/10/2016.
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
