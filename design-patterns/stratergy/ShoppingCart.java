package stratergy;

import java.math.BigDecimal;

public class ShoppingCart {
    
    public void doPayment(Payment payment){
        payment.doPayment(new BigDecimal(1230.12));
    }
}
