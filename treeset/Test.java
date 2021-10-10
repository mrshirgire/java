package treeset;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Book> set=new TreeSet<Book>();  
    
        //Creating Books  objects
        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
        Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
        Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    
        //Adding Books to TreeSet  
        set.add(b1);  
        set.add(b2);  
        set.add(b3);  
    
        //Traversing TreeSet  
        for(Book b:set){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
        }  
    }
}
