package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"manoj");
		map.put(2,"shirgire");
		map.put(3,"ajay");
		map.put(4,"vijay");
		
	    Set<Entry<Integer,String>> entry  = map.entrySet();
	    
	    Iterator itr  = entry.iterator();
	    
	   while(itr.hasNext()) {
		  
		   Entry e = (Entry) itr.next();
		   System.out.println(e.getKey()+" "+e.getValue());  
	    }
		  
	}

}
