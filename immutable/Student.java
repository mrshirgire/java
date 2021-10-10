package immutable;

public final class Student {
    
    private final String name;
	private final int age;
	private final Address address;
	
	public Student(String name, int age, Address address) throws CloneNotSupportedException {
		
		this.name = name;
		this.age = age;
		this.address = (Address) address.clone();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() throws CloneNotSupportedException {
		return (Address) address.clone();
	}

	@Override
	public String toString() {
		return "Student [name: " + name + ", age: " + age + ", city:" + address .getCity()+ ", state:  "+address.getState()+"]";
	}
}
