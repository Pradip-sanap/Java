import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , List<Integer>> map = new HashMap<>();
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		List<Integer> l2 = new ArrayList<>();
		l2.add(4);
		l2.add(5);
		l2.add(6);
		
		map.put("A", l1);
		map.put("B", l2);
		
		
		
		Map<String, List<Integer>> cloneMap  = new HashMap<>(map);
		List<Integer> resultlist = cloneMap.get("A");
		resultlist.add(3333);
		
		
		for(Map.Entry<String , List<Integer>> entry: map.entrySet()) {
			System.out.println(entry.getKey() +":"+entry.getValue());
		}
		
		

	}

}
