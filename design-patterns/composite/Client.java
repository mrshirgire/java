package composite;

public class Client {
    
    public static void main(String[] args) {
        
        DepartmentComponent ITDept = new ITDepartment(100, "Rakesh");
        DepartmentComponent HRDept = new HRDepartment(245, "Sudesh");

        DepartmentComposite departmentComposite = new DepartmentComposite();
        departmentComposite.addDepartment(ITDept);
        departmentComposite.addDepartment(HRDept);

        departmentComposite.displayDetails();
        
    }
}
