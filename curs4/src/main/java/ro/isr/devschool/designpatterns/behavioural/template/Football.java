package ro.isr.devschool.designpatterns.behavioural.template;

/**
 * Created by Mihai MOGOS on 10/11/16.
 */
public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Initializing football game !");
    }

    @Override
    void startPlay() {
        System.out.println("Start playing football !");
    }

    @Override
    void endPlay() {
        System.out.println("End playing football !");
    }
}
