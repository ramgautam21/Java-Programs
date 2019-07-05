import java.util.*;
class Book{
	private String author;
	private String title;
	private String isbn;
	public Book(String author,String title,String isbn){
		this.author = author;
		this.title = title;
		this.isbn = isbn;
	}
	public String getAuthor(){
		return this.author;
	}
	public String getTitle(){
		return this.title;
	}
	public String getIsbn(){
		return this.isbn;
	}

}
class Library{
	private List<Book> book;
	public Library(List<Book> book){
		this.book = book;
	}
	public void Display(){
		System.out.println("The Books in Library Info:   ");
		for(Book b:this.book){
			System.out.println("================================================");
			System.out.println("Author: "+b.getAuthor());
			System.out.println("Title: "+b.getTitle());
			System.out.println("ISBN: "+b.getIsbn());
			// System.out.println("================================================");
		}
	}
}

public class LibraryDemo{
	public static void main(String[] args) {
		Book b1 = new Book("X","JAVA PROGRAMMING","123J");
		Book b2 = new Book("Y","C PROGRAMMING","123C");
		Book b3 = new Book("Z","C++ PROGRAMMING","123CPP");
		List<Book> b = new ArrayList<Book>();
		b.add(b1);
		b.add(b2);
		b.add(b3);
		Library l = new Library(b);
		l.Display();
		
	}
}