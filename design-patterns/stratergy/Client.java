package stratergy;


public class Client {
    
    public static void main(String[] args) {
        
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.doPayment(new PhonePePayment());

        ShoppingCart shoppingCart1 = new ShoppingCart();
        shoppingCart1.doPayment(new CardPayment());
        
    }
    
}
