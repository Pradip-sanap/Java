package delete;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee2 {

    String name;
    int age;

    Employee2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
	public String toString() {
		return "Employee2 [name=" + name + ", age=" + age + "]";
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

public class code7 {

    public static void main(String[] args) {

        List<Employee2> employees = List.of(
                new Employee2("Rahul", 30),
                new Employee2("Amit", 25),
                new Employee2("Sneha", 30),
                new Employee2("Priya", 25),
                new Employee2("Vikas", 35),
                new Employee2("Karan", 30),
                new Employee2("Neha", 25),
                new Employee2("Rohit", 35)
        );
        
        // Task:
        // Sort employees by age in ascending order.
        // If two employees have the same age,
        // sort them by name in alphabetical order.
        
        List<Employee2> ans1 = employees.stream()
        			.sorted(Comparator.comparingInt((Employee2 emp)-> emp.getAge()).thenComparing(e -> e.name))
        			.collect(Collectors.toList());
        System.out.println(ans1);
        
        List<Employee2> ans2 = employees.stream()
        		.sorted(Comparator.comparing(Employee2::getAge).thenComparing(Employee2::getName))
        		.collect(Collectors.toList());
        System.out.println(ans2);

        
         
    }
}
