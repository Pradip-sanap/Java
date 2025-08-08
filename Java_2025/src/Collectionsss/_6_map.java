package Collectionsss;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _6_map {

	public static void main(String[] args) {

		HashMap<Integer, String> stud = new HashMap<>();
		
		stud.put(1, "Rohan");
		stud.put(2, "Tanay");
		stud.put(3, "Shubham");
		
		System.out.println(stud);
		
		String name = stud.get(2);
		System.out.println(name);
		
		System.out.println(stud.containsKey(2));
		System.out.println(stud.containsValue("Tanay"));
		
		Set<Integer> keys = stud.keySet();
		for(int i: keys) {
			System.out.println(stud.get(i));
		}
		
		
		Set<Map.Entry<Integer, String>> entries = stud.entrySet();
		for(Map.Entry<Integer, String> entry: entries) {
//			System.out.println(entry.getKey() +" : "+ entry.getValue());
			entry.setValue(entry.getValue().toUpperCase());
		}
		System.out.println(stud);
		
//		stud. 

	}

}
