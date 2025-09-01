package _08_BridgePattern;

public class Demo {

	public static void main(String[] args) {


		Shape tri = new Triangle(new GreenColor());
		tri.applyColor();
		
		Shape pent = new Pentagon(new RedColor());
		pent.applyColor();
		
		

	}

}
