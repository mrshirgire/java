package proxy;

public class ExpensiveObjectProxy implements ExpensiveObject{

    private static ExpensiveObject object;

    @Override
    public void process() {
        
        if(object == null){
            System.out.println("object create.");
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}
