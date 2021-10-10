package sorting;

class Student implements Comparable<Student> {
	
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student st) {
		
		//sort based on age
	//	return this.age - st.age;
		
		//sort based on name
		
		 //sorting based on desc order
		  //return st.name.compareTo(this.name);
		
			//sorting based on asc order
		  return this.name.compareTo(st.name);
		
		//sort based on age and name
	}
}