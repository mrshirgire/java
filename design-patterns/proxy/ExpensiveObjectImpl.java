package proxy;


public class ExpensiveObjectImpl implements ExpensiveObject{

    ExpensiveObjectImpl(){
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
       //Task of heavy object
       System.out.println("process completed!!");
    }
    
    private void heavyInitialConfiguration() {
        System.out.println("Loading initial configuration...");
    }
    
}
