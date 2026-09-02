package delete;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
    
}

public class code6 {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Rahul", 45000),
                new Employee("Amit", 65000),
                new Employee("Sneha", 75000),
                new Employee("Priya", 55000),
                new Employee("Vikas", 90000),
                new Employee("Neha", 40000),
                new Employee("Rohit", 85000),
                new Employee("Karan", 60000)
        );

        double salaryThreshold = 60000;

        // Your task:
        // Filter employees whose salary is greater than 60000
        // and collect their names.
        
        List<String> ans3 = employees.stream().filter(e -> e.getSalary() > salaryThreshold)
        		.map(e -> e.getName())
        		.collect(Collectors.toList());
        System.out.println(ans3
        		);
        
        Map<Boolean, List<Employee>> ans = employees.stream().filter(emp -> emp.getSalary() > 60000).collect(Collectors.partitioningBy(emp -> emp.getSalary()>60000));
        ans.forEach((k, v) ->{
        	if(k) {
        		System.out.println(v);
        	}
        });
        
         Map<Boolean, List<String>> ans2 = employees.stream().collect(Collectors.groupingBy(emp -> emp.getSalary()>60000, Collectors.mapping(e -> e.getName(), Collectors.toList())));
        System.out.println(ans2);
    }
}