package delete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Empp{
	String name;
	Integer salary;
	public Empp(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Empp() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Empp [name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class codeZ_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>(List.of(84, 39, 92, 77, 18, 52, 84));
		
		Collections.sort(arr);
		System.out.println(arr);
		
		ArrayList<Empp> employees = new ArrayList<Empp>();
		
		employees.add(new Empp("Pradip", 60000));
		employees.add(new Empp("Harshal", 130000));
		employees.add(new Empp("Samadhan", 80000));
		
		Collections.sort(employees, Comparator.comparing(Empp::getSalary));
		System.out.println(employees);
		
				

	}

}
