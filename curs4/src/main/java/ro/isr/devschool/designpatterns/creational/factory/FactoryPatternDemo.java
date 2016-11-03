package ro.isr.devschool.designpatterns.creational.factory;

/**
 * Created by Mucefix on 03/11/16.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get a CIRCLE
        Shape shapeCircle = shapeFactory.getShape("CIRCLE");
        shapeCircle.draw();

        Shape shapeRectangle = shapeFactory.getShape("RECTANGLE");
        shapeRectangle.draw();
    }



}
