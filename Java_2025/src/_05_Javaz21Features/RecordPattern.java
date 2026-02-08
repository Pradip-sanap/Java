package _05_Javaz21Features;

record Person(String name, int id, double salary) {}

//nested Record
record Address(String street, String locality, int pincode) { }
record Employee(String name, int eid, Address addr ) { }

public class RecordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Person("Pradip", 1, 20.0);
		
		if(obj instanceof Person a) {
			System.out.println(a.name());
			System.out.println(a.id());
			System.out.println(a.salary());
		}
		
		if(obj instanceof Person( String name, int id, double salary)) {
			System.out.println(name +","+id+","+salary);
		}
		
		//Nested record
		Object empObj = new Employee("Tanay", 101, new Address("MGRoad", "Nashik", 736288));
		if(empObj instanceof Employee(
				String name,
				int empid, 
				Address(String street,String locality,int pincode))
		) {
			System.out.println(name);
			System.out.println(empid);
			System.out.println(street);
			System.out.println(locality);
			System.out.println(pincode); 
		}

	}

}
