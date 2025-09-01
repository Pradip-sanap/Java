package _10_Flyweight;

public class PineTree implements TreeType {

	private String name = "Pine";      
    private String color = "Dark Green"; 
    private String texture = "Smooth";

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing " + name + " tree at (" + x + ", " + y + ") with color " + color + " and texture " + texture);
    }

}
