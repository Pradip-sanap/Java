package Prototype;

import java.util.HashMap;
import java.util.Map;

class ShapeRegistry {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    // Load objects into the registry
    static {
        shapeMap.put("Circle", new Circle());
        shapeMap.put("Rectangle", new Rectangle());
    }

    public static Shape getShape(String shapeType) {
        Shape cachedShape = shapeMap.get(shapeType);
        return (Shape) cachedShape.clone(); // Cloning instead of creating new instance
    }
}


public class PrototypePatternDemo {
    public static void main(String[] args) {
        Shape clonedShape1 = ShapeRegistry.getShape("Circle");
        System.out.println("Shape: " + clonedShape1.getType());
        clonedShape1.draw();

        Shape clonedShape2 = ShapeRegistry.getShape("Rectangle");
        System.out.println("Shape: " + clonedShape2.getType());
        clonedShape2.draw();
    }
}
