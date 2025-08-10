package Map;

import java.util.LinkedHashMap;

public class _09_LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> stud = new LinkedHashMap<>();
		stud.put(12, "Vikrant");
		stud.put(57, "Shivam");
		stud.put(25, "Harshal");
		stud.put(9, "Sanjiv");
		stud.put(63, "Pradip");
		stud.put(1, "Rajiv");
		stud.put(84, "Rohan");
		
		System.out.println(stud);

	}

}
