package flyweight;

import java.util.HashMap;

public class ShapeFactory {

    public static HashMap<Color, Shape> circleMap = new HashMap<Color, Shape>();

    public static Shape getCircle(Color color){

        Circle circle = (Circle)circleMap.get(color);

        if(circle == null){
            System.out.println("Creating circle of color : " + color);
            circle = new Circle(color);
            circleMap.put(color, circle);
           
        }
        return circle;
    }
}
