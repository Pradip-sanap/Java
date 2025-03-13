import java.util.HashSet;

public class _5_set {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();
		set.add(80);
		set.add(80);
		set.add(90);
		set.add(90);
		set.add(20);
		set.add(50);
		set.add(40);
		set.add(10);
		set.add(70);
		set.add(20);
		set.add(24);
		set.add(79);
		set.add(null);
		set.add(null);
		
		System.out.println(set.toString());

	}

}
