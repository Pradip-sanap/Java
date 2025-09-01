package _07_Adapter.example2;

public class SchoolStudentAdapter implements Student {
	
	SchoolStudent studentOBj;
	
	public SchoolStudentAdapter(SchoolStudent studentOBj) {
		super();
		this.studentOBj = studentOBj;
	}

	@Override
	public String getName() {
		return studentOBj.getFirstName();
	}

	@Override
	public String getSurname() {
		return studentOBj.getLastName();
	}

	@Override
	public String getEmail() {
		return studentOBj.getEmailAddress();
	}

	@Override
	public String toString() {
		return "SchoolStudentAdapter [studentOBj=" + studentOBj + "]";
	}
	
	

}
