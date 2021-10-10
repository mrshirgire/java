package decorator;

public class Client {

    public static void main(String[] args) {
        Car suv = new SUV();
        System.out.println("SUV price: "+suv.getPrice());

        Car sunroofSUV = new SunroofDecorator(suv);
        System.out.println("SUV with sunroof price: "+sunroofSUV.getPrice());

        Car sunroofAlloyWheelSUV = new AlloyWheelDecorator(sunroofSUV);
        System.out.println("SUV with sunroof and alloywheel price: "+sunroofAlloyWheelSUV.getPrice());

    }
    
}
