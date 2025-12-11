package _04_SerializationDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeExample {
	public static void main(String[] args) {
		Employee emp = new Employee("John Doe", 30, "secret123");

		try { 
			FileOutputStream fos = new FileOutputStream("C:\\Users\\pradips\\Music\\Java Repo\\Java_File_Handling\\src\\_04_SerializationDeserialization\\employee.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("Serialization completed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
