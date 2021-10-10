package flyweight;

public class Client {
    
    private static final Color colors[] = { Color.GREEN, Color.RED, Color.ORANGE, Color.BLUE };
    
    public static void main(String[] args) {
        

        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }
    }
    
    private static Color getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
    
}
