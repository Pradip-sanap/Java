package Generics;

import java.util.ArrayList;
import java.util.List;

class Box<T>{
	T value;
	
	Box(T t){
		value=t;
	}
	
	T getValue() {
		return value;
	}
	
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

}

interface Repository<T> {
    void save(T item);
}

class User<T>{
	int uid;
	T salary;
	public User(int uid, T salary) {
		super();
		this.uid = uid;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", salary=" + salary + "]";
	}
	
	<T> void show(T t) {
		System.out.println(t);
	}
	
}

class UserRepository implements Repository<User> {
    public void save(User user) {
        System.out.println("Saving user: " + user);
    }
}

public class tut1 {

	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("Hello");
		String str = (String) ls.get(0);
		System.out.println(str);
				

		Box<String> s1 = new Box<>("hello");
		System.out.println(s1.getValue());
		
		Box<Integer> var = new Box<Integer>(83838);
		System.out.println(var.getValue());
		
		String[] names = {"John", "Jane"};
		Box.printArray(names);

		Integer[] nums = {1, 2, 3};
		Box.printArray(nums);
		
		User<Integer> u1 = new User<>(101, 50000);
		UserRepository repo = new UserRepository();
		repo.save(u1);
		
		
	}

}
