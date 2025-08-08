package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
 

public class _08_HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> stud = new HashMap<>();
		
		stud.put(12, "Vikrant");
		stud.put(57, "Shivam");
		stud.put(25, "Harshal");
		stud.put(9, "Sanjiv");
		stud.put(63, "Pradip");
		stud.put(1, "Rajiv");
		stud.put(84, "Rohan");
		
		HashMap<Integer, String> stud2 = new HashMap<>();
		stud2.put(65, "Sameer");
		stud2.put(43, "Rakesh");
		
		stud.putAll(stud2);
		
		System.out.println(stud.get(9));
		System.out.println(stud.size());
		System.out.println(stud.isEmpty());
//		stud.clear();
		
		System.out.println(stud.containsKey(12));
		System.out.println(stud.containsValue("Pradip"));
		
		Set<Integer> allKeys = stud.keySet();
		System.out.println(allKeys);
		
		Collection<String> allValues =   stud.values();
		System.out.println(allValues);
		
		// Iterating over key-value pairs
//		System.out.println(stud.entrySet());
        for (Map.Entry<Integer, String> entry : stud.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        stud.put(null, null);
        
        System.out.println(stud.getOrDefault(43, "Defaulteed value"));
        
        System.out.println(stud.isEmpty());
        
        stud.forEach((e, v) ->{
        	System.out.println("Key:"+ e+ " & value:"+v);
        });
        
        stud.replace(1, "Rahul");
        
        String str =  stud.toString();
        System.out.println(str);
        
        stud.remove(1);
        stud.remove(65, "Sameer");
        
		
		System.out.println(stud);

	}

}
