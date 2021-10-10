package Singleton;

public class Test {

    public static void main(String args[]){

        MySingleton mySingleton = MySingleton.getInstance();
        MySingleton mySingleton1 = MySingleton.getInstance();

        System.out.println(mySingleton.hashCode());
        System.out.println(mySingleton1.hashCode());

    }
}
