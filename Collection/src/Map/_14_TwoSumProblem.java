package Map;

import java.util.HashMap;

public class _14_TwoSumProblem {

	public static void main(String[] args) {
//		4. **Two Sum Problem**
//	    - Input: `[2,7,11,15], target=9`
//	    - Output: `[0,1]`
		
		int[] arr = {2, 7, 11, 15};
		int target=9;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int p=0, q=0;
		for(int i=0; i< arr.length; i++) {
			int remaining = target - arr[i];
			if(map.containsKey(remaining)) {
				p = map.get(remaining);
				q = i;
				break;
			}else {
				map.put(arr[i], i);
			}
		}
		
		System.out.println(p +" & "+ q);

	}

}
