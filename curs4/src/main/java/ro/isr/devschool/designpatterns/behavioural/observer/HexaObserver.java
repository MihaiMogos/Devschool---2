package ro.isr.devschool.designpatterns.behavioural.observer;

/**
 * Created by Alex Dragan on 11/10/2016.
 */
public class HexaObserver extends Observer{

    public HexaObserver( Subject subject ){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(" Hexa String: "+Integer.toHexString(subject.getState()));
    }
}
