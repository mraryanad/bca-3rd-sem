import java.io.*;

public class SerializeDemo {

   public static void main(String[] args) {
      Employee e = new Employee();
      e.name = "Hemanta Jung Karki";
      e.address = "ITahari Sunsari";
      e.SSN = 11122333;
      e.number = 101;

      try {
         FileOutputStream fileOut = new FileOutputStream("employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in employee.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}

class Employee implements java.io.Serializable {
   public String name;
   public String address;
   public transient int SSN;
   public int number;
}