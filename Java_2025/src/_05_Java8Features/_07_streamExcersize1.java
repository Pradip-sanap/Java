package _05_Java8Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class _07_streamExcersize1 {

	public static void main(String[] args) {
		// -----------------------PartitionBy-----------------------
		// Q. Given a list of integers, partition them
		// into even and odd numbers using partitioningBy()
		List<Integer> given1 = List.of(8, 2, 5, 1, 5, 9, 11, 15, 19, 14);
		Map<Boolean, List<Integer>> out1 = given1.stream().collect(
								Collectors.partitioningBy(e -> e % 2 == 0));
		System.out.println(out1);
		
//		Partition a list of strings into:
//		    - `true` → strings with length > 5
//		    - `false` → strings with length ≤ 5
		List<String> names = List.of("Pradip", "Laxman", "Rohini", "Tai", "Aviraj", "Ashutosh");
		Map<Boolean, List<String>> collect = names.stream().collect(Collectors.partitioningBy(name -> name.length()>5));
		System.out.println(collect);
		
//		Partition a list of names into:
//		    - starting with vowel
//		    - not starting with vowel
		Map<Boolean, List<String>> collect2 = names.stream().collect(Collectors.partitioningBy((name)-> {
			char ch = Character.toLowerCase(((String) name).charAt(0));
			return ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u';
		}));
		
		System.out.println(collect2);
		
		
		//Partition a list of integers into even and odd and count how many elements are in each partition
		Map<Boolean, Long> countMap =
                given1.stream()
                       .collect(Collectors.partitioningBy(
                               n -> n % 2 == 0,  // true = even, false = odd
                               Collectors.counting()  // Count elements in each partition
                       ));

        System.out.println(countMap);
        
     // Partition into empty and non-empty strings and collect distinct values
        List<String> strings = List.of("apple", "", "banana", "", "apple", "cherry", "banana");
        Map<Boolean, Set<String>> result =
                strings.stream()
                       .collect(Collectors.partitioningBy(
                               s -> s.isEmpty(),       // true = empty, false = non-empty
                               Collectors.toSet()      // collect distinct values
                       ));

        System.out.println(result);
        
        
     // Partition numbers into two groups: n > 10 and n <= 10
        List<Integer> numbers = Arrays.asList(5, 12, 7, 20, 3, 15, 10);
        Map<Boolean, Optional<Integer>> maxByPartition = numbers.stream()
                .collect(Collectors.partitioningBy(
                    n -> n > 10,                        // Partitioning predicate
                    Collectors.maxBy(Integer::compare)  // Find max in each partition
                ));

            // Print the results
            System.out.println("Max of n > 10: " + maxByPartition.get(true).orElse(null));
            System.out.println("Max of n <= 10: " + maxByPartition.get(false).orElse(null));
            
            
            
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");
        // Partition strings based on whether they contain 'a'
        Map<Boolean, String> joinedByPartition = words.stream()
            .collect(Collectors.partitioningBy(
                s -> s.contains("a"),                       // Partition predicate
                Collectors.joining(",")                     // Join each partition into a comma-separated string
            ));

        // Print the results
        System.out.println("Strings containing 'a': " + joinedByPartition.get(true));
        System.out.println("Strings not containing 'a': " + joinedByPartition.get(false));
        
        
        List<Employee2> employees = Arrays.asList(
            new Employee2("John", "active", 60000, 29),
            new Employee2("Jane", "inactive", 45000, 35),
            new Employee2("Alice", "active", 75000, 42),
            new Employee2("Bob", "inactive", 30000, 28),
            new Employee2("Charlie", "active", 55000, 31)
        );

        // 1. Partition employees into active and inactive employees
        Map<Boolean, List<Employee2>> activeInactivePartition = employees.stream()
            .collect(Collectors.partitioningBy(e -> "active".equals(e.getStatus())));

        System.out.println("Active employees: " + activeInactivePartition.get(true));
        System.out.println("Inactive employees: " + activeInactivePartition.get(false));

        // 2. Partition employees based on salary > 50,000 and count employees in each group
        Map<Boolean, Long> salaryPartitionCount = employees.stream()
            .collect(Collectors.partitioningBy(e -> e.getSalary() > 50000, Collectors.counting()));

        System.out.println("Employees with salary > 50,000: " + salaryPartitionCount.get(true));
        System.out.println("Employees with salary ≤ 50,000: " + salaryPartitionCount.get(false));

        // 3. Partition employees based on age and collect their names in each partition
        Map<Boolean, List<String>> agePartitionNames = employees.stream()
            .collect(Collectors.partitioningBy(
                e -> e.getAge() >= 30,                  // Partition predicate: age ≥ 30 or not
                Collectors.mapping(Employee2::getName, Collectors.toList())  // Collect names
            ));

        System.out.println("Employees aged ≥ 30: " + agePartitionNames.get(true));
        System.out.println("Employees aged < 30: " + agePartitionNames.get(false));
        
     // Partition employees based on their status (active vs inactive) and calculate average salary in each partition
        Map<Boolean, Double> averageSalaryByStatus = employees.stream()
            .collect(Collectors.partitioningBy(
                e -> "active".equals(e.getStatus()),  // Partitioning predicate: "active" or "inactive"
                Collectors.averagingDouble(Employee2::getSalary)  // Calculate average salary
            ));

        System.out.println("Average salary of active employees: " + averageSalaryByStatus.get(true));
        System.out.println("Average salary of inactive employees: " + averageSalaryByStatus.get(false));

	}

}


class Employee2 {
    String name;
    String status;  // "active" or "inactive"
    double salary;
    int age;

    // Constructor, getters, setters
    public Employee2(String name, String status, double salary, int age) {
        this.name = name;
        this.status = status;
        this.salary = salary;
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
