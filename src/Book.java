import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Book {

	/**
	 * @param args
	 */
	
	private String title;
	private List<Author> authors = new ArrayList<Author>();
	private Topic topic;
	private int year;
	
	
	
	
	
	public Book() { }
	
	public Book(String title, List<Author> authors, Topic topic, int year) {
		this.authors = authors;
		this.title = title;
		this.topic = topic;
		this.year = year;
	}

	public Book(String title, Topic topic, int year) {
		List<Author> authors = new ArrayList<Author>();
		this.authors = authors;
		this.title = title;
		this.topic = topic;
		this.year = year;
	}

	public Book(String title, Author author, Topic topic, int year) {
		List<Author> authors = new ArrayList<Author>();
		authors.add(author);
		this.authors = authors;
		this.title = title;
		this.topic = topic;
		this.year = year;
	}
	
	
	
	
	
	public String toString() {
		String s = "";
		s += this.title + " (" + this.year + ")\n by ";
		for(Iterator<Author> it = authors.iterator(); it.hasNext(); ) {
			Author a = it.next();
			s += a.getAuthor();
			if(it.hasNext()) {
				s += ", ";
			}
		}
		s += "\n  " + this.topic;
		s += "\n\n";
		return s;
	}
	
	public void addAuthor(Author a) {
		this.authors.add(a);
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public List<Author> getAuthors() {
		return this.authors;
	}
	
	public String getAuthorsString() {
		String s = "";
		for (Iterator<Author> it = authors.iterator(); it.hasNext(); ) {
			Author a = it.next();
			s += a.getAuthor();
			if (it.hasNext()) {
				s += ", ";
			}
		}
		return s;
	}
	
	public Topic getTopic() {
		return this.topic;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	public void setAuthors(List<Author> al) {
		this.authors = al;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public static void main(String[] args) throws Exception {
		Author a1 = new Author("Joe Poul", 1927, 1970, "France");
		Author a2 = new Author("Sussan Halli", 1922, 1984, "Italy");
		Author a3 = new Author("Donald Duck", 2000, "Germany");
		Author a4 = new Author("Margareth Williamson", 1400, 1500, "Japan");
		Author a5 = new Author("George Repkins", 1988, "Denmark");
		List<Author> al1 = new ArrayList<Author>();
		al1.add(a3);
		al1.add(a5);
		
		Topic t1 = new Topic(5066, "A fast pacing action thriller with lot's of joy and jellies");
		
		Book b1 = new Book();
		Book b2 = new Book("Crazy stories of the universe", al1, new Topic(7350, "A breathtaking roman about the beginings of our lovely universe"), 2013);
		
		b1.setTitle("My little ponny");
		b1.setTopic(t1);
		b1.setYear(1960);
		
		b1.addAuthor(a1);
		b1.addAuthor(a2);
		b2.addAuthor(a4);
		
		System.out.print(b1);
		System.out.print(b2);
	}

}
