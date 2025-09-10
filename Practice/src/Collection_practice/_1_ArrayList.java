package Collection_practice;

import java.util.ArrayList;
import java.util.Comparator;
class Employee{
	String empid;
	String empName;
	int empAge;
	double salary;
	public Employee(String empid, String empName, int empAge, double salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empAge = empAge;
		this.salary = salary;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empAge=" + empAge + ", salary=" + salary + "]";
	}
	
	
}
public class _1_ArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee("101","Rohit", 36, 90000.00));
		emplist.add(new Employee("102","Virat", 34, 95000.00));
		emplist.add(new Employee("103","Rishabh", 26, 70000.00));
		emplist.add(new Employee("104","Rahul", 29, 60000.00));
		emplist.add(new Employee("105","Shikhar", 35, 40000.00));
		
//		System.out.println(emplist);
		
		Employee employee = emplist.get(1);
		System.out.println(employee);
		
		Comparator c;
		
//		emplist.sort((a, b)-> Integer.compare(a.getEmpAge(), b.getEmpAge()));
//		emplist.removeIf(emp -> emp.getSalary() < 50000.00);

		employee.setEmpAge(55);
		System.out.println(emplist.indexOf(employee));
		System.out.println(emplist.contains(employee));;
		System.out.println(emplist);
		
		Employee[] array =   emplist.toArray(new Employee[0]);
		
		System.out.println(array);
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
			System.out.println(array[i] instanceof Employee);
			
			
		}
		
		

	}

}
