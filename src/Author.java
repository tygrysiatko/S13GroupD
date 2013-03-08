
public class Author {

	private String name;
	private int born;
	private int deceased;
	private String bornWhere;
	
	public Author() { }
	
	public Author(String name, int born, int deceased, String bornWhere){
		this.name = name;
		this.born = born;
		this.deceased = deceased;
		this.bornWhere = bornWhere;
	}

	public Author(String name, int born, String bornWhere){
		this.name = name;
		this.born = born;
		this.bornWhere = bornWhere;
	}
	
	public String getAuthor() {
		return this.name;
	}
	
	public void died(int d) {
		this.deceased = d;
	}
	
	public String toString() {
		String s = "";
		s += this.name + " (" + this.bornWhere + " " + this.born + "-" + this.deceased + ")";
		return s;
	}
	
	public static void main(String[] args) {
		final Author aa = new Author("Joe Poul", 1927, 1970, "France");
		System.out.print(aa);

	}

}
