package _10_Flyweight;

public class OakTree implements TreeType {

	private String name = "Oak";       // intrinsic
    private String color = "Green";    // intrinsic
    private String texture = "Rough";  // intrinsic

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing " + name + " tree at (" + x + ", " + y + ") with color " + color + " and texture " + texture);
    }

}
