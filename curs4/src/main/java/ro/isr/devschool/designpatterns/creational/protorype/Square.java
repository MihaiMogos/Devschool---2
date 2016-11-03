package ro.isr.devschool.designpatterns.creational.protorype;

/**
 * Created by Mucefix on 03/11/16.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}