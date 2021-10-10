package hashmap;

class Student {
	
	int age;
	String name;
	
	public Student(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode(){
		return this.age + name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this==obj)
			return true;
		if(this==null||getClass()!=obj.getClass())
			return false;
		
		Student s = (Student)obj;
		return (this.age==s.age && this.name.equals(s.name));
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	
	
}


public class SortOnValuesDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		
		/*//Sorting on hashMap
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1,"manoj");
		map.put(2,"shirgire");
		map.put(3,"ajay");
		map.put(4,"vijay");
		
		System.out.println("Sorting hashmap on values");
		System.out.println("Before soting ");
		
		map.forEach((key,value)->{
			System.out.println("Key: "+key+" Value: "+value);
		});
		for(Entry<Integer,String> entry: map.entrySet()){
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		
		
		//sort by values logic start
		List<Entry<Integer,String>> list = new ArrayList<Entry<Integer,String>>(map.entrySet());
		
		Collections.sort(list,new Comparator<Entry<Integer,String>>() {
			
			public int compare(Entry<Integer,String> obj1,Entry<Integer,String> obj2){
				return  obj1.getValue().compareTo(obj2.getValue());
				//sorting in descending order
				//return  obj2.getValue().compareTo(obj1.getValue());
			}
		});
		
		Map<Integer,String> sortedMap = new LinkedHashMap<Integer, String>();
		
		for(Entry<Integer,String> entry :list ){
			sortedMap.put(entry.getKey(),entry.getValue());
		}
		
		//sort by values logic end
		
		System.out.println();
		System.out.println("After soting ");
		
		for(Entry<Integer,String> entry: sortedMap.entrySet()){
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}*/	
		
		
		//we can do sorting by TreeMap
/*		System.out.println();
		System.out.println("Using TreeMap");
		Map<Integer,String> treeMap = new TreeMap<Integer,String>(map);
		
		for(Entry<Integer,String> entry: treeMap.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
	*/	
		
		
	}

}
