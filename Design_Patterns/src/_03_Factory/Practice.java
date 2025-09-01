package _03_Factory;

interface Shape {
	void draw();
}

class Circle implements Shape {
	public void draw() {
		System.out.println("Circle ");
	}
}

class Squaree implements Shape {
	public void draw() {
		System.out.println("Square ");
	}
}

class Rectangle implements Shape {
	public void draw() {
		System.out.println("Rectangle");
	}
}

class ShapeFactory {

	public Shape getShape(int input) {

		switch (input) {
		case 1:
			return new Circle();
		case 2:
			return new Rectangle();
		case 3:
			return new Squaree();
		default:
			return null;

		}
	}

}

public class Practice {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		
		Shape shape = sf.getShape(3);
		
		shape.draw();
	}

}
