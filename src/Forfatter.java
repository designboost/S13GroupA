
public class Forfatter {
	private String navn;
	private int born;
	private int deceased;
	private String bornWhere;
	
	public String getNavn()
	{
		return this.navn;
	}
	
	public Forfatter(String navn, int born, int deceased, String bornWhere)
	{
		this.navn = navn;
		this.born = born;
		this.deceased = deceased;
		this.bornWhere = bornWhere;
	}
	
	public String toString()
	{
		return String.format("Forfatter name: %s\nBorn on: %d and in: %s\nDeceased on: %d", this.getNavn(), this.born, this.bornWhere, deceased); 
	}
	public static void main(String[] args) {
		// test the Forfatter class
		
		Forfatter f = new Forfatter("Lev Tolstoi", 1828, 1910,"Iasnaia Poliana");
		System.out.println(f);
	}

}
