
public class Lecture {
	
	private String title;
	private Employee lecturer;
	private String description;
	private int duration;
	
	
	
	public Lecture(String title, Employee lecturer, int duration, String description) {
		this.title = title;
		this.lecturer = lecturer;
		this.description = description;
		this.duration = duration;
	}
	
	
	
	
	public String getTitle() {
		return this.title;
	}
	
	public Employee getLecturer() {
		return this.lecturer;
	}
	
	public int duration() {
		return this.duration;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescroption(String description) {
		this.description = description;
	} 
	
	
	
	
	public String toString() {
		String s = "";
		s += this.title + " (" + this.duration + "min) - " + this.lecturer.name + "\n";
		s += this.description + "\n\n";
		return s;
	}
	
	
	
	public static void main(String[] args) {
		Person bob = new Person(1008884079L, "Bob Budowniczy", "Skolegade 3B mf t.v.");
		Employee emp1 = new Employee(bob, "IT guy", "ASP.NET & Building Buildings");
		Lecture l1 = new Lecture("ASP.NET introduction", emp1, 90, "This lecture covers the basics required to structure some neat and reusable code in nowadays applications using Visual Studio and it's ability to easily write .net code");
		Lecture l2 = new Lecture("ASP.NET forms", emp1, 45, "We look at ASP.NET forms and learn how to use them to our advantage");
		System.out.print(l1);
		System.out.print(l2);
	}

}
