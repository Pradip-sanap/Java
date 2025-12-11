package _01_Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	 
}

class Product {
    String name;
    Product(String name) { this.name = name; }
	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}
    
}

class Order {
    List<Product> products;
    Order(List<Product> products) { 
		    this.products = products; 
    }
    List<Product> getProducts() { return products; }
	@Override
	public String toString() {
		return "Order [products=" + products + "]";
	}
    
    
}

public class delete {

	public static void main(String[] args) {
		List<Integer> list = List.of(20, 200, 30, 400, 20, 500, 210, 30, 400);
		List<Employee> allEmp = Arrays.asList(
				new Employee(1, "John", 20000),
				new Employee(2, "Jerry", 50000),
				new Employee(3, "Sam", 30000),
				new Employee(4, "Carry", 80000)
		);
		
//		Comparator<Integer> salaryComp = (a,b ) -> 
		
		List<Integer> values = list.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(values);
		
		Set<Employee> sortedEmpl = allEmp.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary))
				.collect(Collectors.toSet());
		System.out.println(sortedEmpl);
		
		
		List<Integer> multiBy2 = list.stream().map(e -> e*10).collect(Collectors.toList());
		System.out.println(multiBy2);
		
		List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
		
		
		
		List<Order> orders = Arrays.asList(
	            new Order(Arrays.asList(new Product("Laptop"), new Product("Mouse"))),
	            new Order(Arrays.asList(new Product("Keyboard"), new Product("Monitor")))
	        );
	
		List<Product> allProducts = orders.stream()
	            .flatMap(order -> order.getProducts().stream())
	            .collect(Collectors.toList());
		System.out.println(allProducts);
		System.out.println(allProducts.size());
		
		
		List<Integer> numbers = Arrays.asList(10, 20, 30);
		int sum = numbers.stream().reduce(0, (a, b)-> a+b);
		System.out.println(sum);
		
		Optional<Integer> maxx = list.stream().reduce((a, ele)-> Integer.max(a, ele));
		System.out.println(maxx);
		
		List<String> words = Arrays.asList("apple", "bat", "car", "door", "elephant", "frog", "ant");
		Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(collect);
		
	}

}
