package _05_Prototype;

interface Prototypee extends Cloneable{
	Prototypee cloneObject();
}
class Address implements Prototypee{
	String addre1; 
	String city;
	String street;
	String state;
	public Address(String addre1, String city, String street, String state) {
		super();
		this.addre1 = addre1;
		this.city = city;
		this.street = street;
		this.state = state;
	}
	@Override
	public Address cloneObject() { 
		return new Address(addre1, city, street, state);
	}
	
}
class Person implements Prototypee{
	private int personId;
	private String name;
	private int age;
	private String phoneNo;
	private String email;
	private Address addr;
	
	

	public Person(int personId, String name, int age, String phoneNo, String email, Address prototypee) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.email = email;
		this.addr = prototypee;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public Person cloneObject() {
		Person obj = new Person(personId, name, age, phoneNo, email, addr.cloneObject());
		return obj;
	}



	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age=" + age + ", phoneNo=" + phoneNo + ", email="
				+ email + ", addr=" + addr + "]";
	}
	
	
	
}

public class practice {

	public static void main(String[] args) {
		Address addr = new Address("92/A",  "kalyan", "Gandhi road", "Maharashtra" );
		Person personObj = new Person(101, "Pradip", 24, "8348394349", "pradip@gmail.com", addr);
		
		Person clonePersonObj = personObj.cloneObject();
		
		System.out.println(personObj);
		clonePersonObj.setName("Sunny");
		System.out.println(clonePersonObj);

	}

}
