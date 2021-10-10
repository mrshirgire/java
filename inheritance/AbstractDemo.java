package inheritance;

abstract class Abstract {

    String name = "peter";
    static int age  = 10;
    
    abstract public void display1();
    
    public void display2(){
        System.out.println("non abstarct method in abstract class");
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }

}

class AbstarctImpl extends Abstract {
    
    String name = "akshay";
    public void display1(){
        System.out.println("abstarct method implemented");
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}

public class AbstractDemo {
    
    public static void main(String[] args) {
        
        Abstract abstract1 = new AbstarctImpl();
        abstract1.display1();
        abstract1.display2();

        AbstarctImpl abstarctImpl = new AbstarctImpl();
        abstarctImpl.display1();
        abstarctImpl.display2();
    }
}
