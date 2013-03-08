
public class Employee extends Person {

	
	private String job;
	private String specialization;
	
	
	
	
	public String getJob() {
		return this.job;
	}
	
	public String toString() {
		String s = "";
		s += this.getName() + ": " + this.job + " - " + this.specialization + "\n";
		return s;
	}
	
	
	
	public Employee(Person person, String job, String specialization) {
		super.name = person.getName();
		super.address = person.getAddress();
		super.cpr = person.getCpr();
		super.saldo = person.getSaldo();
		super.saldoYtd = person.getSaldoYtd();
		super.saldoLtd = person.getSaldoLtd();
		this.job = job;
		this.specialization = specialization;
	}
	
	
	
	
	public static void main(String[] args) {
		Person bob = new Person(1008884079L, "Bob Budowniczy", "Skolegade 3B mf t.v.");
		Employee emp1 = new Employee(bob, "IT guy", "ASP.NET & Building Buildings");
		System.out.print(bob);
		System.out.print(emp1);
	}

}
