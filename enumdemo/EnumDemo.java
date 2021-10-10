package enumdemo;

/*Notes:
    The main objective of enum is to define our own data types(Enumerated Data Types)
    Representing a group of named constants
*/

enum Months{
    JAN,FEB,MAR;
    
    static {
        System.out.println("Static block.");
    }
    static void staticMethod(){
        System.out.println("Static method.");
    }

    public void simpleMethod(){
        System.out.println("Simple method.");
    }
}


public class EnumDemo {
    public static void main(String[] args) {
        //Months months[] = Months.values();
        // for(Months m: months){
        //     System.out.println(m+": "+m.ordinal()); 
        // }

        //Output
        // Static block.
        // JAN: 0
        // FEB: 1
        // MAR: 2
        
        Months.JAN.simpleMethod();
        //Output
        // Static block.
        // Simple method.
        Months.staticMethod();
        //Output
        //Static method.

        System.out.println(Months.FEB);    

    }
}
