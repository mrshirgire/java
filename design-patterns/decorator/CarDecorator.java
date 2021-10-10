package decorator;

import java.math.BigDecimal;

public abstract class CarDecorator implements Car{

    private Car car;

    CarDecorator(Car car){
        this.car = car;
    }   

    @Override
    public BigDecimal getPrice() {
        return car.getPrice();
    }
    
}
