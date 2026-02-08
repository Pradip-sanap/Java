package _05_Java9Features;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
class Emp{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class _01_var_keyword {

	public static void main(String[] args) {
		var a = new Emp(1, "Hello");
		System.out.println(a);
		
		List<String> list1 = List.of("Hello", "Java", "11");
		List<Integer> list2 = List.of(11,44, 77,88);
		
		Consumer<Object> con = (var item)-> System.out.println(item);
		
		list1.forEach(con);
		list2.forEach(con);
		 
		

	}

}
