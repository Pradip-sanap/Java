package SOLID_Principles;

abstract class _Bird {
	public abstract void move();
}

class _Sparrow extends _Bird {
	@Override
	public void move() {
		System.out.println("Sparrow is flying");
	}
}

class _Penguin extends _Bird {
	@Override
	public void move() {
		System.out.println("Penguin is swimming");
	}
}

public class _03_LSP_After {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_Bird sparrow = new _Sparrow();
		_Bird penguin = new _Penguin();

		sparrow.move(); // Output: Sparrow is flying
		penguin.move(); // Output: Penguin is swimming

	}

}
