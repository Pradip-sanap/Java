package _04_SerializationDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\pradips\\\\Desktop\\\\My Code\\\\Java\\\\Java_File_Handling\\\\src\\\\_04_SerializationDeserialization\\\\employee.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee emp = (Employee) ois.readObject();
			System.out.println("Deserialization completed!");
			System.out.println(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
