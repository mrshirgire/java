package inheritance;

class Parent{
	
	public static int staticvar = 10;
	int var =20;
	public void parentDisplay() {
		System.out.println("parent");
	}
	
	public static void display() {
		System.out.println("dispaly");
	}
}

class Child extends Parent {
	
	int var =30;
	public void childDisplay() {
		int x = super.var;
		System.out.println("child");
	}
	
	public static void display() {
		System.out.println("overriden dispaly");
	}
}




public class InheritanceTestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent parent = new Child();
		System.out.println("var: "+parent.var); //	parent.var; 
		parent.parentDisplay();	//	called parentdisplay(); //working
	
		int y = Parent.staticvar; //working
		
	//	Parent.display(); //working
		
		Child.display(); // working
		Child child = new Child();
		child.display(); // working
		int z = child.var;
		int a = child.staticvar;
		
		//parent.childDisplay(); //compile time error

	}

}
