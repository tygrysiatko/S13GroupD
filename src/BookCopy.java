import java.util.ArrayList;
import java.util.List;


public class BookCopy extends Book {

	private int copyNr;
	
	public int getCopy() {
		return this.copyNr;
	}
	
	public String toString() {
		String s = "";
		s += "#" + this.copyNr + " - " + this.getTitle() + " (" + this.getYear() + ") - " + this.getAuthorsString() + "\n";
		return s;
	}
	
	public BookCopy(int copyNr, String title, List<Author> authors, Topic topic, int year) {
		super (title, authors, topic, year);
		this.copyNr = copyNr;
	}

	public BookCopy(int copyNr, String title, Author author, Topic topic, int year) {
		super (title, author, topic, year);
		this.copyNr = copyNr;
	}
	
	public BookCopy(int copyNr, Book book) {
		this.copyNr = copyNr;
		super.setAuthors(book.getAuthors());
		super.setTitle(book.getTitle());
		super.setTopic(book.getTopic());
		super.setYear(book.getYear());
	}
	
	public static void main(String[] args) {
		List<Author> al = new ArrayList<Author>();
		al.add(new Author("Jack Boom", 1900, 2000, "Poland"));
		al.add(new Author("Marek Wiesniacki", 1899, "Ukraine"));
		Author a1 = new Author("Jesica Carvera", 1980, "Italy");
		Book b1 = new BookCopy(5289856, "American love story MC", a1, new Topic(9931, "Ta ra ta ta ta"), 2008);
		Book b2 = new Book("Cirque de solei", new Author("Eddie Murphy", 1959, "USA"), new Topic(48925, "Funny"), 1999);
		BookCopy bc1 = new BookCopy(1216534, "Wiennie the pooh", al, new Topic(1234, "yyyyas"), 1999);
		BookCopy bc2 = new BookCopy(1350341, b2);
		System.out.print(bc1);
		System.out.print(b1);
		System.out.print(bc2);
		System.out.print("\n");
		System.out.print(b2);
		
	}

}
