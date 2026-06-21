package Map;

import java.util.HashMap;

public class _15_IntersectionOfTwoArray {

	public static void main(String[] args) {
		int[] n1 = {2, 1, 2, 4, 3};
		int[] n2 = {9, 7, 2, 1, 8, 9};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<n1.length; i++) {
			map.put(n1[i], map.getOrDefault(n1[i], 0) + 1);
		}
		
		for(var e : n2) {
			if(map.containsKey(e)) {
				System.out.print(e+", ");
			}
		}

	}

}
