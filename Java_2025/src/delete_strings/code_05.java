package delete_strings;

sealed class Shape permits Circle, Square {
	void Area() {
		System.out.println("Shape class");
	}
}

final class Circle extends Shape {
	void Area() {
		System.out.println("Circle class");
	}
}

final class Square extends Shape {
	void Area() {
		System.out.println("Square class");
	}
}

public class code_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
