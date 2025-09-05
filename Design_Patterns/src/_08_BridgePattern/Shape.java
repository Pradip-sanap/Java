package _08_BridgePattern;

public abstract class Shape {

	protected Color colorObj;
	
	Shape(Color c){
		colorObj = c;
	}
	
	abstract void applyColor();
}
