package composite;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HRDepartment implements DepartmentComponent{

    private int id;
    private String departmentHead;

    @Override
    public void displayDetails() {
       
        System.out.println("Dept Id: "+id+" Dept Head: "+departmentHead);
    }
}
