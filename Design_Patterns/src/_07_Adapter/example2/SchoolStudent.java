package _07_Adapter.example2;

public class SchoolStudent {
	private String firstName;
	private String lastName;
	private String emailAdress;
	
	public SchoolStudent(String firstName, String lastName, String emailAdress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAdress = emailAdress;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmailAddress() {
		return emailAdress;
	}

	@Override
	public String toString() {
		return "SchoolStudent [firstName=" + firstName + ", lastName=" + lastName + ", emailAdress=" + emailAdress
				+ "]";
	}
	
	
	
	

}
