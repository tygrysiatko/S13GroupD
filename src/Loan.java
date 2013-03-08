
public class Loan {

	
	private Person borrower;
	private BookCopy book;
	private NewGregorianCalendar dateOut;
	private NewGregorianCalendar dateIn;
	private double fine;
	
	
	
	public Person getBorrower() {
		return this.borrower;
	}
	
	public Book getBook() {
		return this.book;
	}
	
	public NewGregorianCalendar returnDate() {
		NewGregorianCalendar n = new NewGregorianCalendar();
		return n;
	}
	
	public void returnBook() {
		
	}
	
	public void returnBook(int yr, int mt, int dy) {
		
	}
	
	public String toString() {
		String s = "";
		return s;
	}
	
	public int amountDays() {
		int days = 0;
		
		return days;
	}
	
	public double calculateFine() {
		double d = 0.00;
		
		return d;
	}
	
	
	
	
	public Loan(Person person, BookCopy book, NewGregorianCalendar dateOut) {
		this.borrower = person;
		this.book = book;
		this.dateOut = dateOut;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
