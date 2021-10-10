package immutable;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Address address = new Address("pune", "maharashtra");
		Student student = new Student("manoj", 30, address);
		System.out.println(student.toString());
		address.setCity("solapur");
		System.out.println(student.toString());
    }
}
