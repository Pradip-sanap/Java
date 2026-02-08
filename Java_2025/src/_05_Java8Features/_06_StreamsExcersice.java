package _05_Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class _06_StreamsExcersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(11, 44, 6, 17, 48);
		
		//find min elemet
		Optional<Integer> minNum = nums.stream()
											.min(Integer::min);
		System.out.println(minNum);


		//filter out even elements
		List<Integer> newStream =  nums.stream()
										.filter((e) -> e %2==0)
										.collect(Collectors.toList());
		System.out.println(newStream);
		
		// multiply every element with 5
		List<Integer> newStream2 = nums.stream()
										.map(e -> e * 5)
										.collect(Collectors.toList());
		System.out.println(newStream2);
		
		
		//find sum of all elements
		int sum  = nums.stream()
						.reduce(0,(a,b) -> a+b);
			
		System.out.println(sum);
		
		
		//convert string to upperCase
		List<String> names = List.of("Rohit", "Messi", "Ronaldo","Sachin");
		List<String> upperCaseName = names.stream()
											.map(String::toUpperCase)
											.collect(Collectors.toList());
		System.out.println(upperCaseName);
		
	
		//find string which contain substring given.
		List<String> find_hit = names.stream()
									.filter(name -> name.contains("hit"))
									.collect(Collectors.toList());
		System.out.println(find_hit);
		
		
		//Print the count of numbers which greater than 10;
		Long greaterThan10 =  nums.stream()
									.filter(e -> e>10)
									.count(); 
		System.out.println(greaterThan10);
		
		
//		Sort a list of integers in ascending and descending order using Streams.
		List<Integer> sortedNums =  nums.stream()
										.sorted()								//increasing or natural order
										//.sorted(Comparator.reverseOrder())	//Descreasing order.
										.collect(Collectors.toList());
		System.out.println(sortedNums);
		
//		Given a list of integers, find the sum of all odd numbers using Streams.
		int sumOfOddNums = nums.stream()
								.filter(e -> e%2!=0)
								.reduce(0, Integer::sum );
		System.out.println(sumOfOddNums);
		
		
	
		List<String> words = Arrays.asList("apple", "bat", "car", "door", "elephant", "frog", "ant");
		
//		Create a program to group a list of strings by their lengths using Collectors.groupingBy()
        Map<Integer, List<String>> groupedByLength = words.stream()
        												.collect(Collectors.groupingBy(s -> s.length()));
        
        System.out.println(groupedByLength);
         

        Map<Integer, Long> countByLength = words.stream()
            .collect(Collectors.groupingBy(String::length, Collectors.counting())); 
        System.out.println(countByLength);
        
        // Group integer by even and odd
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Map<String, List<Integer>> result = numbers.stream()
        			.collect(Collectors.groupingBy(e -> e%2==0 ? "Even":"Odd"));
        System.out.println(result);			//o/p: {Even=[2, 4, 6], Odd=[1, 3, 5]}
        
        
        List<Employee> empls = List.of(
        		new Employee("Alice", "HR", "Manager"),
                new Employee("Bob", "IT", "Developer"),
                new Employee("Charlie", "IT", "Developer"),
                new Employee("David", "HR", "Assistant"),
                new Employee("Eve", "Marketing", "Manager"),
                new Employee("Frank", "Marketing", "Assistant")
        		);
        
        // Group employees by there Department.
        Map<String, List<Employee>> ans = empls.stream()
        				.collect(Collectors.groupingBy(emp -> emp.department));
        System.out.println(ans);
        
        //Group employees by department and collect their names
        Map<String, List<String>> ans2 = empls.stream()
				.collect(Collectors.groupingBy(emp -> emp.department, 
						Collectors.mapping(emp -> emp.getName(), Collectors.toList())));
        System.out.println(ans2);
        
      //Q. Group employees: First by department, Then by job title
        Map<String, Map<String, List<Employee>>> ans3 = empls.stream()
        								.collect(Collectors.groupingBy(	
													Employee::getDepartment,
													Collectors.groupingBy(Employee::getJobTitle)
        										)
        								);
        System.out.println(ans3);
        
        
        
        
        //Q. Group the words by first character.
        List<String> input = List.of("apple", "banana", "avocado", "blueberry");
        Map<Character, List<String>> output = input.stream()
        		.collect(Collectors.groupingBy(word -> word.charAt(0)));
        System.out.println(output);
        
        
        //Q. Group numbers and count how many in each group
        List<String> list2 = List.of("a", "bb", "ccc", "dd");
		Map<Integer, Long> output2 = list2.stream().collect(Collectors.groupingBy(
                String::length,    		// Group by word length
                Collectors.counting()   // Count how many words in each group
        ));
		System.out.println(output2);
		
		//Q. Group numbers by range
		List<Integer> list3 = List.of(3, 7, 12, 18, 25, 30);
		Map<String, List<Integer>> output3 = list3.stream().collect(Collectors.groupingBy(
						num ->{
							if (num >= 0 && num <= 10) {
                                return "0-10";
                            } else if (num >= 11 && num <= 20) {
                                return "11-20";
                            } else {
                                return "21+";
                            }
						}
				));
		
		System.out.println(output3);
		
		
		
		List<String> list1 = List.of("apple", "bat", "car", "door", "elephant", "frog", "ant");

		Map<Integer, List<Character>> firstLettersByLength = list1.stream()
		    .collect(Collectors.groupingBy(
		        String::length,
		        Collectors.mapping(s -> s.charAt(0), Collectors.toList())
		    ));

		System.out.println(firstLettersByLength);
		
		
		List<String> list4 = List.of("apple", "bat", "car", "door", "elephant", "frog", "ant");

		Map<Integer, Map<Character, List<String>>> groupedTwoLevel = list4.stream()
		    .collect(Collectors.groupingBy(
		        String::length,
		        Collectors.groupingBy(s -> s.charAt(0))
		    ));

		System.out.println(groupedTwoLevel);
		
		
		//Group Strings by Length and Find the Longest String in Each Group
		List<String> list5 = List.of("apple", "bat", "car", "door", "elephant", "frog", "ant");

		Map<Integer, Optional<String>> longestByLength = list5.stream()
		    .collect(Collectors.groupingBy(
		        ele -> ele.length(),
		        Collectors.maxBy(Comparator.naturalOrder())
		    ));

		longestByLength.forEach((length, wordOpt) ->
		    System.out.println(length + ": " + wordOpt.orElse("No words"))
		);
		
		
		
		
		
		
        		
	}

}

class Employee {
    String name;
    String department;
    String jobTitle;
    Employee(String name, String department, String jobTitle) {
        this.name = name;
        this.department = department;
        this.jobTitle = jobTitle;
    }
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", jobTitle=" + jobTitle + "]";
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
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	} 
}
