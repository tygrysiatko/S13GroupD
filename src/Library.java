import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Library {

	
	
	private List<BookCopy> bookAssortment = new ArrayList<BookCopy>();
	private List<Book> bookTitles = new ArrayList<Book>();
	private List<Person> borrowers = new ArrayList<Person>();
	private List<Employee> employees = new ArrayList<Employee>();
	private String name;
	
	
	
	
	public void addBookCopy(BookCopy book) {
		this.bookAssortment.add(book);
	}
	
	public void addBookCopies(List<BookCopy> bookCopies) {
		for(Iterator<BookCopy> it = bookCopies.iterator(); it.hasNext(); ) {
			BookCopy bookCopy = it.next();
			this.bookAssortment.add(bookCopy);
		}
	}
	
	public void addBook(Book book) {
		this.bookTitles.add(book);
	}
	
	public void addBooks(List<Book> books) {
		for(Iterator<Book> it = books.iterator(); it.hasNext(); ) {
			Book book = it.next();
			this.bookTitles.add(book);
		}
	}
	
	public void addEmloyee(Employee emp) {
		this.employees.add(emp);
	}
	
	public void addBorrower(Person borrower) {
		this.borrowers.add(borrower);
	}
	
	public void printBookList() {
		System.out.println("Printing current book stand...");
		if(bookAssortment.isEmpty()) {
			System.out.println("Oops... No books in the ibrary...");
		}else{
			for(Iterator<BookCopy> it = bookAssortment.iterator(); it.hasNext(); ) {
				BookCopy bc = it.next();
				System.out.print(bc);
			}
		}
	}
	
	public void printEmployees() {
		
	}
	
	public void printBorrowers() {
		
	}
	
	public String toString() {
		String s = "";
		return s;
	}
	
	
	
	
	public Library() { }
	
	public Library(String name) {
		this.name = name;
	}
	
	public Library(String name, List<BookCopy> bookAssortment, List<Book> bookTitles, List<Employee> employees, List<Person> borrowers) {
		this.name = name;
		this.bookAssortment = bookAssortment;
		this.bookTitles = bookTitles;
		this.employees = employees;
		this.borrowers = borrowers;
	}
	
	
	
	
	public static void main(String[] args) {
		
		// Instantiating the authors
		
		Author a1 = new Author("Margareth Prker", 1920, 1978, "France");
		Author a2 = new Author("Mark Trakly Preksen", 1967, 2003, "Greece");
		Author a3 = new Author("Mikkel Sorensen", 1920, "Denmark");
		Author a4 = new Author("Wieslaw Zdzichowski", 1970, 2012, "Poland");
		Author a5 = new Author("Roberto Ammarone", 1920, "Italy");
		Author a6 = new Author("Juliette Sarrakozte", 1920, 1978, "Spain");
		Author a7 = new Author("Minoko Hazura", 1976, 2010, "Japan");
		Author a8 = new Author("Joe Robertson Raphelneck", 1857, "USA");
		Author a9 = new Author("Wladimir Krasciajski", 1673, 1722, "Russia");
		Author a10 = new Author("Bjerke Lovendom", 1920, 1978, "Netherlands");
		
		
		// Instantiating the topics
		
		Topic t1 = new Topic(8592662, "Love story with a twist");
		Topic t2 = new Topic(9277758, "Hate as the point in the storytelling");
		Topic t3 = new Topic(8845858, "Who does need babies? Noone!");
		Topic t4 = new Topic(8285485, "Consumption as the driving factor of nowadays economy");
		Topic t5 = new Topic(8824582, "We all love the rainy days, would it be nice to..");
		Topic t6 = new Topic(6550555, "The introduction to the world of informatics");
		Topic t7 = new Topic(2542252, "More than just a next skatebording guide");
		Topic t8 = new Topic(6668224, "Best cooking recipies of all-times");
		Topic t9 = new Topic(7512842, "The love life of canadian penguins");
		Topic t10 = new Topic(6885462, "Tragedy in the United States");
		
		
		// Instantiating books
		
		Book b1 = new Book("Wieenie the Pooh", t1, 1947);
		Book b2 = new Book("Star Wars Exstasy", t2, 2001);
		Book b3 = new Book("Fluffy Puffy Jellies", t3, 2000);
		Book b4 = new Book("Nightmare of the Vampire King", t4, 1967);
		Book b5 = new Book("Up and Go", t5, 1992);
		Book b6 = new Book("Welbeing of Haiti", t6, 1988);
		Book b7 = new Book("Pocet guide to cat stroking", t7, 1933);
		Book b8 = new Book("Why are you a noob?", t8, 2012);
		Book b9 = new Book("Love me, love me!!", t9, 2007);
		Book b10 = new Book("Everybody likes icecream", t10, 1935);
		
		
		// Adding books titles to a collection
		
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		books.add(b6);
		books.add(b7);
		books.add(b8);
		books.add(b9);
		books.add(b10);
		
		// Assigning authors to the books
		
		b1.addAuthor(a3);
		b1.addAuthor(a8);
		b2.addAuthor(a9);
		b3.addAuthor(a2);
		b4.addAuthor(a5);
		b4.addAuthor(a7);
		b5.addAuthor(a9);
		b6.addAuthor(a3);
		b6.addAuthor(a5);
		b7.addAuthor(a10);
		b8.addAuthor(a1);
		b8.addAuthor(a10);
		b9.addAuthor(a6);
		b10.addAuthor(a4);
		b10.addAuthor(a8);
		b10.addAuthor(a3);
		
		// Creating 10 copies of each book
		
		List<BookCopy> bookCopies = new ArrayList<BookCopy>();
		for(Iterator<Book> it = books.iterator(); it.hasNext(); ) {
			Book book = it.next();
			int i = 0;
			while(i < 10) {
				Random rnd = new Random();
				BookCopy bc = new BookCopy(rnd.nextInt(999998), book);
				bookCopies.add(bc);
				i++;
			}
		}
		
		
		// Instantiating Library
		
		Library library = new Library("Vejle Biblioteket");
		library.addBookCopies(bookCopies);
		library.printBookList();
				
		
	}

}
