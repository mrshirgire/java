package hashcode_equals;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
class Person{
    private String name;
    private int age;
}

public class Test {
    
    public static void main(String[] args) {

        String str1 = "test";
        String str2 = "test";

        System.out.println("hashcode of str1: "+str1.hashCode());
        System.out.println("hashcode of str2: "+str2.hashCode());

        System.out.println("str1 == str1: "+(str1 == str1));
        System.out.println("str1.equals(str2): "+str1.equals(str2));
        System.out.println("------------------------------------------");
        

        Integer i = 10;
        Integer j = 10;

        System.out.println("hashcode of i: "+i.hashCode());
        System.out.println("hashcode of j: "+j.hashCode());

        System.out.println("i == j: "+(i == j));
        System.out.println("i.equals(j): "+i.equals(j));
        System.out.println("------------------------------------------");
        

        Person p1 = new Person("rakesh", 20);
        Person p2 = new Person("rakesh", 20);

        /* before equals and hashcode method override by person */
        // System.out.println("hashcode of p1: "+p1.hashCode()); 
        // System.out.println("hashcode of p2: "+p2.hashCode());

        // System.out.println("p1 == p2: "+(p1 == p2)); //false
        // System.out.println("p1.equals(p2): "+p1.equals(p2)); //false
        /* ------------------------------------------------------ */
        
        /* 
        Hashcode and equals contract:
            - If two objects are equal then their hashoce must be same
            - if hashcodes of two objects are equal then they may be or not may be equal
        */

        /* after equals and hashcode method override by person */
        System.out.println("hashcode of p1: "+p1.hashCode()); 
        System.out.println("hashcode of p2: "+p2.hashCode());

        System.out.println("p1 == p2: "+(p1 == p2)); //false
        System.out.println("p1.equals(p2): "+p1.equals(p2)); //true
        /* ------------------------------------------------------ */

        System.out.println("testing without");



    }
}


