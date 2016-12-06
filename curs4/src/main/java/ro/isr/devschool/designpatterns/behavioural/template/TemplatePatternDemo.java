package ro.isr.devschool.designpatterns.behavioural.template;

/**
 * Created by Mihai MOGOS on 10/11/16.
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
