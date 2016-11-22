package ro.isr.devschool.designpatterns.behavioural.template;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Mihai MOGOS on 10/11/16.
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game initialized ! ");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started !");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Ended !");
    }
}
