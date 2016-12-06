package ro.isr.devschool.designpatterns.creational.protorype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mihai MOGOS on 03/11/16.
 */
public class ShapeCache {

    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape)cachedShape.clone();
    }

    public static  void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }

}
