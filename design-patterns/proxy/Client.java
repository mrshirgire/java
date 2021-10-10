package proxy;

public class Client {
    
    public static void main(String[] args) {
        
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
