package decorator;

import java.math.BigDecimal;

public class AlloyWheelDecorator extends CarDecorator{

    AlloyWheelDecorator(Car car) {
        super(car);
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal alloywheelAmount = new BigDecimal(70000.00);
        return super.getPrice().add(alloywheelAmount);
    }
    
}
