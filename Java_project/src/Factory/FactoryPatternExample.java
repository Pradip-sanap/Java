package Factory;

interface Polygon {
	String getType();
}

class Triangle implements Polygon {
	@Override
	public String getType() {
		return "Triangle";
	}
}

class Square implements Polygon {
	@Override
	public String getType() {
		return "Square";
	}
}

class Pentagon implements Polygon {
	@Override
	public String getType() {
		return "Pentagon";
	}
}

class PolygonFactory {
	public static Polygon getPolygon(int numberOfSides) {
		switch (numberOfSides) {
		case 3:
			return new Triangle();
		case 4:
			return new Square();
		case 5:
			return new Pentagon();
		default:
			throw new IllegalArgumentException("No such polygon with " + numberOfSides + " sides.");
		}
	}
}

public class FactoryPatternExample {
	public static void main(String[] args) {
		Polygon polygon = PolygonFactory.getPolygon(3);
		System.out.println(polygon.getType()); // Outputs: Triangle

		polygon = PolygonFactory.getPolygon(4);
		System.out.println(polygon.getType()); // Outputs: Square
	}
}
