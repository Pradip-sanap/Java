package delete;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class code2 {

	public static void main(String[] args) {
		// find strings start with "A"
		List<String> names = Arrays.asList(
			    "Apple",
			    "Amazon",
			    "Banana",
			    "Avocado",
			    "Mango",
			    "Apricot",
			    "Orange",
			    "Almond",
			    "Grapes",
			    "Ant",
			    "Pineapple"
			);
		
		List<String> ans = names.stream().filter(str -> str.toUpperCase().startsWith("A")).collect(Collectors.toList());
		System.out.println(ans);
		
		
//		finds strings with length greater than 3
		List<String> words = Arrays.asList(
			    "Java",
			    "Spring",
			    "API",
			    "Boot",
			    "Microservices",
			    "SQL",
			    "aaiaia",
			    "Kafka",
			    "REST",
			    "AI",
			    "Docker"
			);
		
		List<String> ans2 = words.stream().filter(str -> str.length()>3).collect(Collectors.toList());
		System.out.println(ans2);
		
		//sort the List of strings in ascending and descending order
		List<String> asc = words.stream().sorted().collect(Collectors.toList());
		System.out.println(asc);
		
		List<String> desc = words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(desc);
		
		// use Reduce method to join all string as a single sentence.
		List<String> words2 = List.of(
			    "Java",
			    "Streams",
			    "are",
			    "powerful",
			    "and",
			    "useful"
			);
		
		String ans3 = words2.stream().reduce("", (a, b) -> a + " " + b);
		System.out.println(ans3);
		
	}

}
