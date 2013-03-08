
public class Topic {

	private int nr;
	private String name;
	
	public Topic() { }
	
	public Topic(int nr, String name) {
		this.nr = nr;
		this.name = name;
	}
	
	public String toString() {
		String s = "";
		s = String.format("#%s: \"", this.nr);
		s += this.name + "\"";
		return s;
	}
	
	public static void main(String[] args) {
		Topic t1 = new Topic(1482, "A fantastic romance about two squirels in love");
		Topic t2 = new Topic(3756, "A comedy with an amazing twist");
		Topic t3 = new Topic(9445, "A horror movie with lot's of zombies");
		System.out.print(t1 + "\n" + t2 + "\n" + t3);

	}

}
