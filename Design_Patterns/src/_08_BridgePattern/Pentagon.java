package _08_BridgePattern;

public class Pentagon extends Shape{

	Pentagon(Color c) {
		super(c); 
	}

	@Override
	void applyColor() {
		System.out.print("Pentagon filled with color ");
        colorObj.applyColor();
	}

	
}
