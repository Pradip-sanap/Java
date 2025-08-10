package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class User {
    String name;
    boolean active;

    public User(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return name + (active ? " (Active)" : " (Inactive)");
    }
}

public class _07_streamExcersize4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> users = Arrays.asList(
                new User("Alice", true),
                new User("Bob", false),
                new User("Charlie", true),
                new User("David", false),
                new User("Emma", true)
        );
		
		Map<Boolean, List<User>> partition = users.stream().collect(Collectors.partitioningBy(User::isActive));
		System.out.println(partition);
		
		List<User> activeUsers = partition.get(true);
		System.out.println(activeUsers);
		List<User> InActiveUsers = partition.get(false);
		System.out.println(InActiveUsers);
		
		
		
		

	}

}
