
public class Reservation {

	
	private Book book;
	private NewGregorianCalendar date;
	private Person borrower;
	
	
	
	public GregorianCalendar getDate() {
		GregorianCalendar g = new GregorianCalendar();
		return g;
	}
	
	
	
	
	public Reservation(Book book, Person borrower, NewGregorianCalendar date) {
		this.book = book;
		this.borrower = borrower;
		this.date = date;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
