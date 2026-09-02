package delete;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Empl {
	String name;
	int age;
	@Override
	public String toString() {
		return "Empl [name=" + name + ", age=" + age + "]";
	}
	public Empl(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class codeZ_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empl> employees = Arrays.asList(
	            new Empl("Pradip", 28),
	            new Empl("zishan", 35),
	            new Empl("Amit", 25),
	            new Empl("Ajay devgan", 28),
	            new Empl("John", 30),
	            new Empl("zishan", 25)
	        );
		
		Comparator<Empl> sortByAge_asc = (a, b) -> a.getAge() - b.getAge();
		Comparator<Empl> sortByAge_desc = (a, b) -> b.getAge() - a.getAge();
		
		Comparator<Empl> sortByName_asc = (a, b) -> a.getName().compareTo(b.getName());
		Comparator<Empl> sortByName_desc = (a, b) -> b.getName().compareTo(a.getName());
		
		List<Empl> collect = employees.stream().sorted(sortByName_desc.thenComparing(sortByAge_asc)).collect(Collectors.toList());
		System.out.println(collect);
		
//		OR
		
		List<Empl> ans2 = employees.stream().sorted(Comparator.comparing(Empl::getName).thenComparing(Empl::getAge))
							.collect(Collectors.toList());
		System.out.println(ans2);

	}

}
