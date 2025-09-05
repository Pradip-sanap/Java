package _10_Flyweight;

public class Main {

	public static void main(String[] args) {
		// Draw 5 Oak trees
        for (int i = 0; i < 5; i++) {
            TreeType oak = TreeFactory.getTree("Oak");
            oak.draw(i, i * 10);
        }

        // Draw 3 Pine trees
        for (int i = 0; i < 3; i++) {
            TreeType pine = TreeFactory.getTree("Pine");
            pine.draw(i * 5, i * 15);
        }

	}

}
