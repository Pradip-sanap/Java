package _05_Java8Features;

@FunctionalInterface
interface Addable {
	public int addition(int a, int b);
}

public class _01_LambdaExpreDemo {

	public static void main(String[] args) { 
		
		Addable obj1 = (a, b) -> a + b;
		
		int sum = obj1.addition(5, 5); 
		System.out.println(sum);

	}

}
