package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _16_CountofSubarraysWhoseSumEqualTarget {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
		int target = 3;
		
		int prefixSum = 0;
		int count=0;
		
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		map.put(0, 1);
		
		for(int i=0; i<arr.length; i++) {
			prefixSum += arr[i];
			
			 
			
			if(map.containsKey(prefixSum-target)) {
				 count += map.get(prefixSum - target);
			}
			
			map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
		}
		System.out.println(map.keySet());
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
