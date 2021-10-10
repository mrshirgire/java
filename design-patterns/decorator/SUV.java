package decorator;

import java.math.BigDecimal;

public class SUV implements Car{

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(1100000.00);
    }
    
}
