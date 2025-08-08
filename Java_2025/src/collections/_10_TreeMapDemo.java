package collections;

import java.util.Map;
import java.util.TreeMap;

public class _10_TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a TreeMap with natural ordering
		TreeMap<Integer, String> treeMap = new TreeMap<>();

		// Adding entries using put()
		treeMap.put(3, "Apple");
		treeMap.put(1, "Banana");
		treeMap.put(5, "Cherry");
		treeMap.put(4, "Date");
		treeMap.put(2, "Elderberry");

		System.out.println("TreeMap: " + treeMap);

		// Accessing elements using get()
		System.out.println("Value for key 3: " + treeMap.get(3)); // Output: Apple

		// Checking if a key exists
		System.out.println("Contains key 2? " + treeMap.containsKey(2)); // Output: true

		// Checking if a value exists
		System.out.println("Contains value 'Date'? " + treeMap.containsValue("Date")); // Output: true

		// First and last keys
		System.out.println("First Key: " + treeMap.firstKey()); // Output: 1
		System.out.println("Last Key: " + treeMap.lastKey()); // Output: 5

		// Removing an entry
		treeMap.remove(5);
		System.out.println("After removing key 5: " + treeMap);

		// NavigableMap methods
		System.out.println("Floor Key (<=3): " + treeMap.floorKey(3)); // Output: 3
		System.out.println("Ceiling Key (>=3): " + treeMap.ceilingKey(3)); // Output: 3
		System.out.println("Lower Key (<3): " + treeMap.lowerKey(3)); // Output: 2
		System.out.println("Higher Key (>3): " + treeMap.higherKey(3)); // Output: 4

		// First and last entries
		System.out.println("First Entry: " + treeMap.firstEntry()); // Output: 1=Banana
		System.out.println("Last Entry: " + treeMap.lastEntry()); // Output: 4=Date

		// Submaps and range queries
		System.out.println("HeadMap (<3): " + treeMap.headMap(3)); // Output: {1=Banana, 2=Elderberry}
		System.out.println("TailMap (>=3): " + treeMap.tailMap(3)); // Output: {3=Apple, 4=Date}
		System.out.println("SubMap (2 inclusive to 4 exclusive): " + treeMap.subMap(2, 4)); // Output: {2=Elderberry,
																							// 3=Apple}

		// Reverse order methods
		System.out.println("Descending Key Set: " + treeMap.descendingKeySet()); // Output: [4, 3, 2, 1]
		System.out.println("Descending Map: " + treeMap.descendingMap()); // Output: {4=Date, 3=Apple, 2=Elderberry,
																			// 1=Banana}

		// Iterating over TreeMap
		System.out.println("Iterating over keys:");
		for (Integer key : treeMap.keySet()) {
			System.out.println(key + " -> " + treeMap.get(key));
		}

		System.out.println("Iterating over entries:");
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		// Accessing values
		System.out.println("Values: " + treeMap.values()); // Output: [Banana, Elderberry, Apple, Date]

	}

}
