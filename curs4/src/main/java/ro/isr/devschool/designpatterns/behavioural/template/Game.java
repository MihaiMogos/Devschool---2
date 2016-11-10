package ro.isr.devschool.designpatterns.behavioural.template;

/**
 * Created by Mucefix on 10/11/16.
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        //force the implementer to execute the set of actions in a specific order
        initialize();
        startPlay();
        endPlay();
    }

}
