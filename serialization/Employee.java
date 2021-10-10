package serialization;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Employee implements java.io.Serializable {
    
    static final long SerialVersionUID = 10l;

    Integer id;
    String name;
    //String dept;
    //transient String address;

    public void show(){
        System.out.println("id: "+id+" name: "+name);
    }

 }

