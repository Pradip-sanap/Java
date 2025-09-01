package _08_BridgePattern;

public class Triangle extends Shape{

	Triangle(Color c) {
		super(c);
		 
	}

	@Override
	void applyColor() {
		System.out.print("Triangle filled with color ");
        colorObj.applyColor();
		
	}

}
