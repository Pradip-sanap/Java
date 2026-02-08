package _05_Javaz17Features;
sealed interface Shape permits Square, Circle{
	public void area();
}

final class Square implements Shape{
	public void area() {
		
	}
}

final class Circle implements Shape{
	public void area() {
		
	}
}
public class SealedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
