package _05_Javaz17Features;

record EmployeeRecord(String name, int age,  String email) {
	
	public EmployeeRecord{
		if(age < 18)  {
			throw new IllegalArgumentException("Age cannot be negative");
		}	
	}
//	
	
} 

public class RecordDemo {

	public static void main(String[] args) {
		EmployeeRecord obj = new EmployeeRecord("Pradip", 12,  "pradip@gmail.com");
		System.out.println(obj.name());
		System.out.println(obj.email());
		
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		

	}

}
