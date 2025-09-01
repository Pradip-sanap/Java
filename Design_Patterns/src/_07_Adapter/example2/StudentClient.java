package _07_Adapter.example2;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

	public List<Student> getStudentList(){
		List<Student> students = new ArrayList<>();
		
		CollegeStudent collegeStudent = new CollegeStudent("a", "b", "c");
		
		SchoolStudent schoolStudent = new SchoolStudent("X", "Y", "Z");
		
		students.add(collegeStudent);
		
		students.add(new SchoolStudentAdapter(schoolStudent));			// <--- adapter
		
		return students;
	}
}
