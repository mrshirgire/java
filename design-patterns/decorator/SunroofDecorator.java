package decorator;

import java.math.BigDecimal;

public class SunroofDecorator extends CarDecorator{
    
    SunroofDecorator(Car car) {
        super(car);
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal sunroofAmount = new BigDecimal(50000.00);
        return super.getPrice().add(sunroofAmount);
    }
    
}
