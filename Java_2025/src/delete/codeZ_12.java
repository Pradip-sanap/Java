package delete;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee3 {

    String name;
    String department;
    double salary;

    Employee3(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    

    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
    public String toString() {
        return "Employee{name='" + name +
                "', department='" + department +
                "', salary=" + salary + "}";
    }
}

public class codeZ_12 {

    public static void main(String[] args) {

        List<Employee3> employees = List.of(
                new Employee3("Rahul", "IT", 70000),
                new Employee3("Amit", "IT", 80000),
                new Employee3("Sneha", "IT", 90000),

                new Employee3("Priya", "HR", 50000),
                new Employee3("Neha", "HR", 60000),
                new Employee3("Karan", "HR", 55000),

                new Employee3("Vikas", "Finance", 75000),
                new Employee3("Rohit", "Finance", 85000),

                new Employee3("Anita", "Sales", 45000),
                new Employee3("Raj", "Sales", 55000),
                new Employee3("Pooja", "Sales", 65000)
        );

        // Task:
        // Group employees by department
        // and calculate the average salary for each department.
        Map<String, Double> ans = employees.stream()
        				.collect(Collectors.groupingBy(emp -> emp.getDepartment(), 
        										Collectors.averagingDouble(Employee3::getSalary))
        				);
        System.out.println(ans);
    }
}
