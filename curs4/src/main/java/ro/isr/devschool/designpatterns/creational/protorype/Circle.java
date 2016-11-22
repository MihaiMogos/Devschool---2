package ro.isr.devschool.designpatterns.creational.protorype;

/**
 * Created by Mihai MOGOS on 03/11/16.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}