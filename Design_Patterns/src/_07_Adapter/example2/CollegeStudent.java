package _07_Adapter.example2;

public class CollegeStudent implements Student {
	private String name;
	private String surname;
	private String email;
	
	

	public CollegeStudent(String name, String surname, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
 
	public String getName() {
		return name;
	}
 
	public String getSurname() {
		return surname;
	}
 
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "CollegeStudent [name=" + name + ", surname=" + surname + ", email=" + email + "]";
	}
	
	

}
