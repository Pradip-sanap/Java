package _04_Prototype;

//interface Prototype {
//	Prototype clone();
//}

class Book implements Prototype {
	private String title;

	public Book(String title) {
		this.title = title;
	}

	public void showTitle() {
		System.out.println("Book Title: " + title);
	}

	@Override
	public Prototype clone() {
		return new Book(this.title); // Creating a new instance with the same title
	}
}

public class PrototypeExample2 {
	public static void main(String[] args) {
		Book originalBook = new Book("Design Patterns");

		originalBook.showTitle();

		// Cloning the original book
		Book clonedBook = (Book) originalBook.clone();
		clonedBook.showTitle();
	}
}
