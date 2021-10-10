package composite;

import java.util.ArrayList;
import java.util.List;

public class DepartmentComposite implements DepartmentComponent{

    List<DepartmentComponent> departmentComponents;

    DepartmentComposite(){
        departmentComponents = new ArrayList<>();
    }


    public void addDepartment(DepartmentComponent departmentComponent){
        departmentComponents.add(departmentComponent);
    }

    public void deleteDepartment(DepartmentComponent departmentComponent){
        departmentComponents.remove(departmentComponent);
    }


    @Override
    public void displayDetails() {

        departmentComponents.forEach(departmentComponent ->{
            departmentComponent.displayDetails();
        });
        
    }
}
