package Java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class _07_streamEe5 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
	            new Person("Charlie", 30),
	            new Person("David", 25),
	            new Person("Alice", 25),
	            new Person("Bob", 30),
	            new Person("Eve", 35)
	        );
		
//		Sort a list of custom objects by multiple fields (e.g., by age and then by name).
		List<Person> sorted = persons.stream()	
					.sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName, String.CASE_INSENSITIVE_ORDER))
					.collect(Collectors.toList());
		
		System.out.println(sorted);
		
		

	}

}
