package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student{
	int rollno;
	String name;
	int std;
	public Student(int rollno, String name, int std) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.std = std;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", std=" + std + "]";
	}
	
	
	
	
	
}
public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] list = new Student[10]; 
		
		list[0] = new Student(21, "Asmita", 12);
		list[1] = new Student(14, "vivek", 10);
		list[2] = new Student(23, "Rajiv", 11);
		list[3] = new Student(32, "santosh", 8);
		list[4] = new Student(4, "Pratik", 15);
		list[5] = new Student(1, "Viraj", 5);
		
		ArrayList<Student> lists = new ArrayList<>();
		lists.addAll(Arrays.asList(list));
		
		lists.forEach(e -> System.out.println(e));
		
		System.out.println(lists.get(2));
		
		List<Student> subList = lists.subList(1, 4);
		System.out.println(subList);
		
		int indexOf = lists.indexOf(list[2]);
		System.out.println(indexOf);
		
		Object obj = list[1];
		
		
		boolean contains = lists.contains(obj);
		System.out.println(contains);
		
		lists.removeIf(e -> e==null);
		
		Comparator<Student> sortByRollNo = (a, b) -> a.rollno - b.rollno;
		lists.sort(sortByRollNo);
		
		System.out.println(lists);
		
		lists.replaceAll(e -> {
			e.setRollno(e.getRollno()*100);
			return e;
		});
		
		System.out.println(lists);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
