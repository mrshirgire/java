package treeset;

import lombok.AllArgsConstructor;

/*
  
 IMP Notes : if we save any object into treeset then that 
 class must be implement Comparable interface 
 and override compareTo method  otherwise it will give 
 runtime error as "Exception in thread "main" java.lang.ClassCastException: pratice.treeset.Book cannot be cast to java.lang.Comparable"
*/


@AllArgsConstructor
public class Book implements Comparable<Book>{
    
    int id;  
    String name,author,publisher;  
    int quantity;
    
    public int compareTo(Book b) {  
        if(id>b.id){  
            return 1;  
        }else if(id<b.id){  
            return -1;  
        }else{  
        return 0;  
        }  
    }
}
