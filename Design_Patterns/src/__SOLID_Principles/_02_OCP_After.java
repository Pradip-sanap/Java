package __SOLID_Principles;
interface Shape {
    double calculateArea();
}

class _Rectangle implements Shape {
    private double width;
    private double height;

    @Override
    public double calculateArea() {
        return width * height;
    }

	public _Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

   
}

class _Circle implements Shape {
    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

	public _Circle(double radius) {
		super();
		this.radius = radius;
	} 
}

class _AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
public class _02_OCP_After {

	public static void main(String[] args) {
		Shape rectangle = new _Rectangle(4, 5);
        Shape circle = new _Circle(3);

        _AreaCalculator calculator = new _AreaCalculator();
        System.out.println("Rectangle area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle area: " + calculator.calculateArea(circle));

	}

}
