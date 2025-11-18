package _06_ComparatorClass;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice");

        // Collect into a List
        List<String> list = names.stream().collect(Collectors.toList());
        System.out.println("List: " + list);

        // Collect into a Set
        Set<String> set = names.stream().collect(Collectors.toSet());
        System.out.println("Set: " + set);
        
     // Collect into a Map
        Map<String, Integer> map = names.stream()
        		.distinct()
                .collect(Collectors.toMap(item -> item, String::length));
        System.out.println("Map: " + map);
        
     // Join elements with a delimiter
        String result = names.stream().collect(Collectors.joining(", "));
        System.out.println("Joined: " + result);
        
        
        
        List<String> items = Arrays.asList("Apple", "Banana", "Cherry", "Avocado");
        // Group by first letter
        Map<Character, List<String>> grouped = items.stream()
                .collect(Collectors.groupingBy(item -> item.charAt(0)));
        System.out.println("Grouped: " + grouped);
        
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        // Partition into even and odd numbers
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println("Partitioned: " + partitioned);
        
        
        //counting
        List<String> items2 = Arrays.asList("Apple", "Banana", "Cherry", "Apple", "Banana");

        // Count total elements
        long count = items2.stream().collect(Collectors.counting());
        System.out.println("Total Count: " + count);

        // Count occurrences of each item
        Map<String, Long> itemCount = items2.stream()
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()));
        System.out.println("Item Count: " + itemCount);
        
        
        //reducing
        List<Integer> numbers2 = Arrays.asList(10, 20, 30, 40, 50);

        // Reduce to find product of all numbers
        Optional<Integer> product = numbers2.stream()
                .collect(Collectors.reducing((a, b) -> a * b));
        product.ifPresent(result2 -> System.out.println("Product: " + result2));
        
        
        
        
       

	}

}
