package Map;

import java.util.HashMap;

public class _12_LongestSubstring {

	public static void main(String[] args) {
//		2. **Longest Substring Without Repeating Characters**
//	    - Input: `"abcabcbb"`
//	    - Output: `3` (`"abc"`)
		
		String str = "cadazabcd";		//ans : "zabcd"
		
		if(str.isEmpty()) {
			System.out.println("String is empty");
			return;
		}
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		int l = 0, r = 0;		// two pointer 
		
		int start=0;
		int end=0;
		int maxCount = 0; 		// maxSubArrCount
		while(r < str.length()) {
			char ch = str.charAt(r);
			if(map.containsKey(ch)) {
				l = Math.max(l, map.get(ch) + 1); 
			}
			map.put(ch, r);
			int count = r-l + 1;
			if(count>maxCount) {
				start=l;
				end = r;
				maxCount = count;
			}
			r++;
		}
		
		System.out.println("start: "+ start);
		System.out.println("End: "+ end);
		for(int i=start; i<=end; i++) {
			System.out.print(str.charAt(i) + " ");
		}
		

	}

}
