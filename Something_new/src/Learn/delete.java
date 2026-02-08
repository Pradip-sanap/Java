package Learn;

sealed class Animal permits Cat, Dog, Elephant{
	public void Animal() {
		System.out.println("Animal constructor");
	}
}
final class Cat extends Animal{
	
}
final class Dog extends Animal{
	
}
non-sealed class Elephant extends Animal{
	
}
class ElephantBaby extends Elephant{
	
}

sealed interface Payment permits Card{
	void pay();
}
sealed interface Card extends Payment permits DebitCard{
	
}
final class DebitCard implements Card{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}
	
}

public class delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
