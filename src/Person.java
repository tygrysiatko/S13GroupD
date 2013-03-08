import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Person {
	
	
	
	protected Cprno cpr;
	protected String name;
	protected String address;
	protected double saldo;
	protected double saldoYtd;
	protected double saldoLtd;
	protected List<Loan> loans = new ArrayList<Loan>();
	protected List<Reservation> reservations = new ArrayList<Reservation>();
	
	
	
	
	
	public void borrow(BookCopy bookCopy) {
		NewGregorianCalendar c = new NewGregorianCalendar();
		Loan loan = new Loan(this, bookCopy, c);
		loans.add(loan);
	}
	
	public void reserv(Book title) {
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public Cprno getCpr() {
		return this.cpr;
	}
	
	public List<Loan> getLoans() {
		return this.loans;
	}
	
	public List<Reservation> getReservations() {
		return this.reservations;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public double getSaldoYtd() {
		return this.saldoYtd;
	}
	
	public double getSaldoLtd() {
		return this.saldoLtd;
	}
	
	public void settleAccount(double amount) {
		try{
			if(amount <= 0){
				throw new Exception("The amount must be grater then 0");
			}else if(this.saldo < amount) {
				throw new Exception("Not enough founds");
			}else{
				this.saldo -= amount;
				this.saldoYtd += amount;
				if(this.saldoYtd > 0) {
					this.saldo += this.saldoYtd;
					this.saldoYtd = 0;
				}
				this.saldoLtd += amount;
			}
		}catch(Exception e){
			System.err.print(e.getMessage());
			return;
		}
	}
	
	public void addMoney(double amount) {
		this.saldo += amount;
	}
	
	public void clearSaldoYtd(){
		this.saldoYtd = 0.00;
	}
	
	public String toString(){
		String s = "";
		s += this.name + " (" + this.cpr + ")\n";
		s += "Current Saldo: " + this.saldo + "\n";
		s += "Saldo Year-to-date: " + this.saldoYtd + "\n";
		s += "Saldo Life-to-date: " + this.saldoLtd + "\n";
		s += "Borrowed books: \n";
		if(this.loans.isEmpty()) {
			s += "No books borrowed...\n";
		}else{
			for(Iterator<Loan> it = this.loans.iterator(); it.hasNext(); ){
				Loan loan = it.next();
				s += loan.getBook().getTitle();
				if(it.hasNext()) s += ", ";
			}
			s += "\n";
		}
		s += "Reserved books: \n";
		s += "" + "Some, Two \n";
		s += "\n";
		return s;
	}
	
	
	
	
	public Person() { }
	
	public Person(Cprno cpr, String name, String address){
		this.cpr = cpr;
		this.name = name;
		this.address = address;
		this.saldo = 0.00;
		this.saldoYtd = 0.00;
		this.saldoLtd = 0.00;
		this.loans = new ArrayList<Loan>();
		this.reservations = new ArrayList<Reservation>();
	}

	public Person(Long cprno, String name, String address){
		try{
			this.cpr = new Cprno(cprno);
		}catch(Exception e) {
			System.err.print(e.getMessage());
			return;
		}
		this.name = name;
		this.address = address;
		this.saldo = 0.00;
		this.saldoYtd = -20.00;
		this.saldoLtd = 0.00;
		this.loans = new ArrayList<Loan>();
		this.reservations = new ArrayList<Reservation>();
	}
	
	public Person(Cprno cpr, String name, String address, double saldo, double saldoYtd, double saldoLtd, List<Loan> loans, List<Reservation> reservations){
		this.name = name;
		this.address = address;
		this.cpr = cpr;
		this.saldo = saldo;
		this.saldoYtd = saldoYtd;
		this.saldoLtd = saldoLtd;
		this.loans = loans;
		this.reservations = reservations;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Book book = new Book("Ars Amandi", new Author("Jesica Parker", 1980, "Canada"), new Topic(412352, "Guess what :p"), 2013);
		BookCopy bookCopy = new BookCopy(5813548, book);
		BookCopy bookCopy1 = new BookCopy(1528465, book);
		Person p1 = new Person(1008884079L, "Kamil Michalak", "Herslebsgade 1A");
		p1.addMoney(100);
		p1.settleAccount(100);
		p1.borrow(bookCopy);
		p1.borrow(bookCopy1);
		System.out.print(p1);
	}

}
