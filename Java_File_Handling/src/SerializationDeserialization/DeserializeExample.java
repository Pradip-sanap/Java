package SerializationDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\pradips\\Music\\employee.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee emp = (Employee) ois.readObject();
			System.out.println("Deserialization completed!");
			System.out.println(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
