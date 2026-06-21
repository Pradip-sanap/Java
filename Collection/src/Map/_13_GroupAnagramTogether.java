package Map;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _13_GroupAnagramTogether{

	public static void main(String[] args) {
//		3. **Group Anagrams Together**
//	    - Input: `["eat","tea","tan","ate","nat","bat"]`
//	    - Output: `[["eat","tea","ate"], ["tan","nat"], ["bat"]]`
		
		String[] str = {"eat","tea","tan","ate","nat","bat"};
		
		HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		int indx = 0;
		for(String e : str ) {
			char[] charArray = e.toCharArray();
			Arrays.sort(charArray);
			String sortedStr = Arrays.toString(charArray);
			if(map.containsKey(sortedStr)) {
				 map.get(sortedStr).add(indx);
			} else {
				map.put(sortedStr, new ArrayList<Integer>(List.of(indx)));				
			}
			
			
			indx++;
		}
		
		map.forEach((key, value) -> {
			value.forEach(e -> {
				System.out.print(str[e]+ ",  ");
			});
			System.out.println();
		});

	}

}
