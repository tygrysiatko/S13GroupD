
public class PlannedLecture{
	
	private Lecture lecture;
	private String forum;
	private NewGregorianCalendar calendar;
	private double entryFee;
	
	

 	public PlannedLecture(Lecture lecture, NewGregorianCalendar calendar, double entryFee) {
 		this.lecture = lecture;
 		this.calendar = calendar;
 		this.entryFee = entryFee;
 	}
	
 	public PlannedLecture(Lecture lecture, String forum, NewGregorianCalendar calendar, double entryFee) {
 		this.lecture = lecture;
 		this.forum = forum;
 		this.calendar = calendar;
 		this.entryFee = entryFee;
 	}
	
 	
 	
 	
 	public void setForum(String forum) {
 		this.forum = forum;
 	}
 	
 	public void signUp(Person person) {
 		if(person.getSaldo() >= this.entryFee) {
 			person.addMoney(-entryFee);
 			System.out.print(person.getName() + " has been signed up for " + this.lecture.getTitle() + "\n\n");
 		}else{
 			System.out.print("Not enough founds. Need " + this.entryFee + " but " + person.saldo + " is available\n\n");
 		}
 	}
 	
 	public String toString() {
 		String s = "";
 		
 		return s;
 	}
 	
 	
	
	
	public static void main(String[] args) {
		Person p1 = new Person(1008884079L, "Kamil Michalak", "Herslebsgade 1A");
		p1.addMoney(100);
		Person bob = new Person(1008884079L, "Bob Budowniczy", "Skolegade 3B mf t.v.");
		Employee emp1 = new Employee(bob, "IT guy", "ASP.NET & Building Buildings");
		Lecture l1 = new Lecture("ASP.NET introduction", emp1, 90, "This lecture covers the basics required to structure some neat and reusable code in nowadays applications using Visual Studio and it's ability to easily write .net code");
		Lecture l2 = new Lecture("ASP.NET forms", emp1, 45, "We look at ASP.NET forms and learn how to use them to our advantage");
		PlannedLecture pl1 = new PlannedLecture(l1, new NewGregorianCalendar(), 80);
		PlannedLecture pl2 = new PlannedLecture(l2, new NewGregorianCalendar(), 100);
		pl1.signUp(p1);
		pl2.signUp(p1);
		pl1.signUp(emp1);
	}

}
