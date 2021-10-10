package flyweight;

import lombok.Data;

@Data
public class Circle implements Shape{

    private Color color;
    private int x;
    private int y;

    Circle(Color color){
        this.color = color;
    }

    @Override
    public void draw() {

        switch(this.color){
            case GREEN:
                System.out.println("draw circle with color GREEN  and co-ordinates are X:"+x+" Y: "+y);
                break;
            case ORANGE:
                System.out.println("draw circle with color ORANGE and co-ordinates are X:"+x+" Y: "+y);
                break;
            case BLUE:
                System.out.println("draw circle with color BLUE   and co-ordinates are X:"+x+" Y: "+y);
                break;
            case RED:
                System.out.println("draw circle with color RED    and co-ordinates are X:"+x+" Y: "+y);
                break;
        }
    }
    
}
