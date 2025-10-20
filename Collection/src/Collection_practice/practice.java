package Collection_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee{
	 int eid;
	 String name;
	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	 
 }

public class practice {
    public static void main(String[] args) {
        Predicate<Employee> demo = (e) -> e.getEid() > 18;
        
//        System.out.println(demo.test(new Employee(33, "ashdfaj")));;
        
        List<String> words = Arrays.asList("apple", "bat", "car", "door", "elephant", "frog", "ant");
        Map<Object, List<String>> group = words.stream()
        										.collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(group.values());
        System.out.println(group);
    }
}
