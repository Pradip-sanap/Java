package _05_Javaz17Features;

sealed class Book permits Natraj, Doms{
	int id;
	String bookName;
	public Book(int id, String bookName) {
		super();
		this.id = id;
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
}

final class Natraj extends Book {

	public Natraj(int id, String bookName) {
		super(id, bookName);
		// TODO Auto-generated constructor stub
	}
	
}
final class Doms extends Book {

	public Doms(int id, String bookName) {
		super(id, bookName);
		// TODO Auto-generated constructor stub
	}
	
}
public class SealedClasses {

	public static void main(String[] args) {
		 

	}

}
