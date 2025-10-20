package Java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class _02_FunctionInterfaceDemo {

	public static void main(String[] args) {
		Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

//        System.out.println(add.operate(5, 10));       	// Output: 15
//        System.out.println(multiply.operate(5, 10)); 	// Output: 50
        
        
        
        
//------------Build in Functional Interfaces-----------
//------1. Predicate<T>
        List<String> names = Arrays.asList("Alice", "Bob", "Alex", "Charlie");
        
        Predicate<String> startsWithA = (str)->  str.startsWith("A");
        
        System.out.println(startsWithA.test("Annanya"));
        
        names.stream()
        	.filter(startsWithA)
        	.forEach(System.out::println);
        
        
        
        
//------2. Consumer<T>
        
        Consumer<String> logger = msg -> System.out.println(msg);
        
        logger.accept("program exacuted!!");
        
//------3.Function<T, R>
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Function<Integer, Integer> square = ele -> ele * ele;
        
        numbers.stream()
        		.map(square)
        		.forEach(System.out::println);;
        
        		
//------4. Supplier
        Random random = new Random();
        Supplier<Integer> randomNum = () -> random.nextInt(100);
        
        System.out.println("Supplier : "+randomNum.get());
        
//------5. BiConsumer<T t, U u>
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);

        // BiConsumer to print key-value pairs
        BiConsumer<String, Integer> printEntry = (name, score) -> 
            System.out.println(name + " scored " + score);

        // Iterating and printing using BiConsumer
        scores.forEach(printEntry);
        
//------6. BiFunctional(T t, U u, R r) 
        BiFunction<Integer, Integer, Integer> calculateArea = (length, breadth) -> length * breadth;

        // Using BiFunction
        System.out.println("Area: " + calculateArea.apply(5, 10));  // Output: Area: 50
        
//------7. UnaryOperator
        UnaryOperator<Integer> increment = n -> n + 1;

        // Using UnaryOperator
        System.out.println(increment.apply(5));  // Output: 6
        
//------8. BinaryOperator
        BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;

        // Using BinaryOperator
        System.out.println(max.apply(10, 20));  // Output: 20
        
        
//        Comparator<Integer> c;
//        Runnable r;
//        Callable<Integer> cc;
	}

}
