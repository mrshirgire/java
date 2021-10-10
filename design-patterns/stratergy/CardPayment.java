package stratergy;

import java.math.BigDecimal;

public class CardPayment implements Payment{
  
    @Override
    public void doPayment(BigDecimal amount) {
        System.out.println("Transaction has been successfully done by Card."); 
    }
    
}
