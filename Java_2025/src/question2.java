

class Author {
	String name;
	
	Author(String name){
		this.name = name;
	}
	
	
}


public class question2 implements Cloneable{
	String title;
	Author author;
	question2(String title, Author author){
		this.title = title;
		this.author = author;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String[] args) {
		Author author = new Author("J.K.");
		question2 originalBook = new question2("Harry Potter", author);
		question2 cloneBook = null;
		
		
		try {
			cloneBook = (question2) originalBook.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		cloneBook.title = "Harry Potter - The clone";
		cloneBook.author.name = "Anonymous";
		
		System.out.println(originalBook.title + "by"+originalBook.author.name);

	}

}
