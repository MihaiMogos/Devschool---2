package ro.isr.devschool.designpatterns.structural.decorator;

/**
 * Created by Mucefix on 10/11/16.
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }

}
