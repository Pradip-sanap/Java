package _05_Javaz17Features;

record EmployeeRecord(String name, String email){
	
	
	
	
	
	
}

public class RecordDemo {

	public static void main(String[] args) {
		EmployeeRecord obj = new EmployeeRecord("Pradip", "pradip@gmail.com");
		System.out.println(obj.name());
		System.out.println(obj.email());
		
		System.out.println(obj.toString());

	}

}
