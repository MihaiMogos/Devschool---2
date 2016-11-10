package ro.isr.devschool.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex Dragan on 11/10/2016.
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState(){
        return this.state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for( Observer observer : observers ){
            observer.update();
        }
    }
}
