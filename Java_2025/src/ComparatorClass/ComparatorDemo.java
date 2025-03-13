package ComparatorClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = List.of("Mango", "Banana", "Apple", "PineApple", "Cherry");

		List<String> sorted1 = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sorted1);

		List<String> reversesorted2 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversesorted2);

		List<String> sorted3 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(sorted3);

		List<String> sorted4 = fruits.stream().sorted((e1, e2) -> e1.charAt(0) - e2.charAt(0))
				.collect(Collectors.toList());
		System.out.println(sorted4);

		List<Employee> allEmployees = new ArrayList<>();
		allEmployees.add(new Employee("Rohit", 35, 90000));
		allEmployees.add(new Employee("Virat", 21, 35000));
		allEmployees.add(new Employee("Bhumbra", 28, 65000));
		allEmployees.add(new Employee("Rishab", 25, 55000));

		List<Employee> sortAgeWise = allEmployees.stream()
				.sorted((o1, o2) -> o1.getAge() - o2.getAge())
				.collect(Collectors.toList());
		System.out.println(sortAgeWise);
		
		List<Employee> sortNameWise = allEmployees.stream()
				.sorted((o1, o2) -> o1.getName().charAt(0) - o2.getName().charAt(0))
				.collect(Collectors.toList());
		System.out.println(sortNameWise);
		
		List<Employee> sortNameWise2 = allEmployees.stream()
				.sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println(sortNameWise2);

		
	}

}
