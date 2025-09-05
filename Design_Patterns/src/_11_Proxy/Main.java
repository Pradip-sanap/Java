package _11_Proxy;

interface Image {
    void display();
}

class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();  // expensive operation
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}

class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;  // holds actual object

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        // load image lazily
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}


public class Main {

	public static void main(String[] args) {
		Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image not loaded yet
        System.out.println("First time display:");
        image1.display();  // loads and displays

        System.out.println("\nSecond time display:");
        image1.display();  // uses cached RealImage, no loading again

        System.out.println("\nDisplay second image:");
        image2.display();  // loads and displays

	}

}
