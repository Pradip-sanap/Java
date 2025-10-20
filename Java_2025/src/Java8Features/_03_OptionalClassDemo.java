package Java8Features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Optional;

public class _03_OptionalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> data1 = Optional.of("Apple");
		Optional<String> data2 = Optional.ofNullable(null);
//		Optional<String> data8 = Optional.ofNullable("cherry");
		Optional<String> data3= Optional.empty();
		
//		if(data1.isPresent()) { 
//			System.out.println("Data present");
//		}
		
//		data1.ifPresent((value)-> 
//				System.out.println("hello" + value)
//			);
		
//		System.out.println(data1.get());
//		System.out.println(data2.get());	// throw error because it hold null value
 
		System.out.println(data1.orElse("Banana"));
		System.out.println(data2.orElse("Banana"));
		
		System.out.println(data1.orElseGet(()-> "Cherry"));
		System.out.println(data2.orElseGet(()-> "Cherry"));
		
		try {
		    String result = data2.orElseThrow(()-> new ArithmeticException("Divide my zero"));
		} catch (ArithmeticException e) {
		    System.out.println("No value present , Error: "+ e);
		}
		
		System.out.println(data1.map(String::toUpperCase));
		
		
		 // Using ifPresentOrElse with a value present
		data1.ifPresentOrElse(
            value -> System.out.println("Value is present: " + value),  // Action for present value
            () -> System.out.println("Value is absent")                 // Action for empty Optional
        );

        // Using ifPresentOrElse with an empty Optional
		data2.ifPresentOrElse(
            value -> System.out.println("Value is present: " + value),
            () -> System.out.println("Value is absent")
        );
		
		//-------------------------------------
//		HashMap<Integer, String> hmap = new HashMap<>();
//		hmap.put(1, "Pradip");
//		hmap.put(4, "Rohan");
//		hmap.put(8, "Harshal");
//		hmap.put(7, "Vishal");
//		hmap.put(3, "Sarthak");
		
//		ArrayList<Integer> arr = new ArrayList<>();
//		arr.add(22);
//		arr.add(11);
//		arr.add(66);
//		arr.add(55);
//		arr.add(44);
//		
//		Optional<ArrayList<Integer>> data = Optional.ofNullable(arr);
//		System.out.println(data );
//		System.out.println(data.get());
//		data.map( element  ->{
//			
//		});
		
		
		
		
		 
	}

}
 