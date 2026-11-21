package ArrayList;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

class Employee{
	int empId;
	String empName;
	double salary;
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
	
}

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<Employee> sortById = (a, b)-> a.getEmpId() - b.getEmpId();
		Comparator<Employee> sortBySalary = (a, b)-> Double.compare(a.getSalary(), b.getSalary());;
		PriorityQueue<Employee> p_queue = new PriorityQueue<Employee>(sortBySalary);
		p_queue.add(new Employee(101, "Pradip", 60000));
		p_queue.add(new Employee(102, "sunny", 70000));
		p_queue.add(new Employee(103, "Pradip", 50000));
		
		System.out.println(p_queue);
		System.out.println(p_queue.size());
		if(p_queue.isEmpty()) {
			System.out.println("Empty!!");
		}
		
		System.out.println(p_queue.peek());

	}

}
