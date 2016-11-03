package ro.isr.devschool.designpatterns.creational.protorype;

/**
 * Created by Mucefix on 03/11/16.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
