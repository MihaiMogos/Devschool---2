package ro.isr.devschool.designpatterns.behavioural.observer;

/**
 * Created by Mucefix on 10/11/16.
 */
public class BinaryObserver extends  Observer {

    public BinaryObserver( Subject subject ){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println(" Binary String: "+ Integer.toBinaryString(subject.getState()));
    }

}
