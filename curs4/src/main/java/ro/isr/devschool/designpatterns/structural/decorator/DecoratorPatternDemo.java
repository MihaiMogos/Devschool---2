package ro.isr.devschool.designpatterns.structural.decorator;

/**
 * Created by Mihai MOGOS on 10/11/16.
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        System.out.println();

        Shape redCircle = new RedShapeDecorator(circle);
        redCircle.draw();

    }
}
