package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

    public static void main(String args[]) {
        Employee employee = null;
        try {
            FileInputStream fileIn = new FileInputStream("./serialization/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            employee = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized Employee...");
        System.out.println("Id: " + employee.id);
        System.out.println("Name: " + employee.name);
        //System.out.println("Address: " + employee.address);
        
    }

}
