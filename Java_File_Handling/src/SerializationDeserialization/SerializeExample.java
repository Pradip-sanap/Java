package SerializationDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeExample {
	public static void main(String[] args) {
		Employee emp = new Employee("John Doe", 30, "secret123");

		try { 
			FileOutputStream fos = new FileOutputStream("C:\\Users\\pradips\\Music\\employee.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("Serialization completed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
