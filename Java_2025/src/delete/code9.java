package delete;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employeee {
    String name;
    List<String> skills;

    Employeee(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
    
}

public class code9 {

	public static void main(String[] args) {
		List<List<Integer>> numbers = List.of(
                List.of(1, 2, 3, 4),
                List.of(3, 4, 5, 6),
                List.of(5, 6, 7, 8),
                List.of(8, 9, 10),
                List.of(1, 10, 11, 12)
        );

        // Task:
        // Flatten the nested lists
        // and collect only unique integers.
		
		List<Integer> ans = numbers.stream().flatMap(List::stream) .collect(Collectors.toList());
		System.out.println(ans);
		
		//------------------------------------------------------
		List<List<String>> words = List.of(
			    List.of("Java", "Spring"),
			    List.of("Kafka", "Docker"),
			    List.of("Redis", "MongoDB")
			);
		List<String> ans2 = words.stream().flatMap(List::stream).distinct().collect(Collectors.toList());
		System.out.println(ans2);
		
		//------------------------------------------------------
		//Get all unique skills.
		List<Employeee> employees = List.of(
			    new Employeee("Rahul", List.of("Java", "Spring", "Kafka")),
			    new Employeee("Amit", List.of("Java", "Docker")),
			    new Employeee("Sneha", List.of("React", "JavaScript", "TypeScript")),
			    new Employeee("Priya", List.of("Spring", "Kafka", "Docker"))
			);
		List<String> ans3 = employees.stream().flatMap(emp -> emp.getSkills().stream()).distinct().collect(Collectors.toList());
		System.out.println(ans3);
		
		
		//------------------------------------------------------
		// Get Names of employee who has kafka skill.
		List<String> ans4 = employees.stream().filter(emp -> emp.getSkills().contains("Kafka")).map(emp -> emp.getName()).collect(Collectors.toList());
		System.out.println(ans4);
		
		//------------------------------------------------------
		// Count uniques number of skills in all employees
		 long count = employees.stream().flatMap(emp -> emp.getSkills().stream()).distinct().count(); 
		 System.out.println(count);

	}

}
