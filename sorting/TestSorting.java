package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestSorting {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> al = new ArrayList<Student>();
		
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21)); 
		
		al.stream().filter(student->student.rollno>100)
					.map(student->student.age*10)
					.collect(Collectors.toList());
		
		/*	
			Comparabele are comparator both are interfaces

			Comparable interface has compareTo method
			Comparator interface has compare method

			If we use comparable then we can not chnage compare logic at runtime it is stick to our class
			if we want to change sorting logic then we need to change in class compareTo method.

			With the help of comparator we can change sorting logic at run time 
		*/	
	//	sorting if Comparable interface implemented
		Collections.sort(al);
		System.out.println("sorting based on age by Comparable interface");
		
		al.forEach(student->{System.out.println("name : "+student.name+" Age :"+student.age);});
		/*	
		sorting based on age Comparator
		Collections.sort(al,new AgeComparator());
		
		System.out.println();
		System.out.println("sorting based on age Comparator");
		
		al.forEach(student->{
			System.out.println("name : "+student.name+" Age :"+student.age);
		});
		
		sorting based on name Comparator
		Collections.sort(al,new NameComparator());
		
		
		System.out.println();
		System.out.println("sorting based on name Comparator");
		
		al.forEach(student->{
			System.out.println("name : "+student.name+" Age :"+student.age);
		});*/
		
		//by using inner class 
		// Comparator<Student> s = (Student s1, Student s2)-> s1.rollno-s1.rollno;
		 
		Collections.sort(al,new Comparator<Student>(){

			@Override
			public int compare(Student student1, Student student2) {
					return student1.name.compareTo(student2.name);
			}
			
		}); 
		
		System.out.println();
		System.out.println("sorting based on name anonymous class");
		
		al.forEach(student->{
			System.out.println("name : "+student.name+" Age :"+student.age);
		});
		
		Collections.sort(al,(s1, s2)-> s1.rollno-s1.rollno);
		 
		System.out.println();
		System.out.println("sorting based on role by lambda expression");
			
		al.forEach(student->System.out.println("roll no : "+student.rollno+" name : "+student.name+" Age :"+student.age));
	
	}

}
