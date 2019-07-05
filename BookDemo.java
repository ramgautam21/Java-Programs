import java.util.*;
class Book{
	private String title;
	private String author;
	private int year;
	public Book(){
		System.out.println("Default constructor is called:");
	}
	public Book(String title,String author,int year){
		this.title = title;
		this.author = author;
		this.year = year;
	}
	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
	public int getYear(){
		return this.year;
	}
	public void display(){
		System.out.println("Following are the Info: ");
		System.out.print("Title: "+this.title);
		System.out.print("Author: "+this.author);
		System.out.print("Year: "+this.year);

	}
}

public class BookDemo{
	public static void main(String[] args) {
		String title;
		String author;
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Title: ");
		title = sc.nextLine();
		System.out.println("Enter Author: ");
		author = sc.nextLine();
		System.out.println("Enter year: ");
		year = sc.nextInt();
		Book b = new Book();
		Book bo = new Book(title,author,year);
		System.out.println("Book Title: "+bo.getTitle());
		System.out.println("Book's Author: "+bo.getAuthor());
		System.out.println("Year Published: "+bo.getYear());
		
		bo.display();

		
	}
}