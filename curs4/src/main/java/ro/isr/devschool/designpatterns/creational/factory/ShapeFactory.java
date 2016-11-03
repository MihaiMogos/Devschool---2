package ro.isr.devschool.designpatterns.creational.factory;

/**
 * Created by Mucefix on 03/11/16.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }
        if( "CIRCLE".equals(shapeType) ){
            return new Circle();
        }
        if( "RECTANGLE".equals(shapeType)){
            return new Rectangle();
        }
        if( "SQUARE".equals(shapeType) ){
            return new Square();
        }

        return null;
    }

}
