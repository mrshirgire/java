package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize{
    
   public static void main(String args[]) {
      //Employee employee = new Employee(123, "manoj", "Pune","IT");
      Employee employee = new Employee(123, "manoj");
      

      try {
         FileOutputStream fileOut = new FileOutputStream("./serialization/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(employee);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in employee.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
      
      System.out.println("Serialized Employee...");
      System.out.println("Id: " + employee.id);
      System.out.println("Name: " + employee.name);
      //System.out.println("Address: " + employee.address);

   }
}