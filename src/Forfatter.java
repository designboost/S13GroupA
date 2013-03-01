
public class Forfatter {

	/**
	 * @param args
	 */
	
	private String navn;
	private int born;
	private int deceased;
	private String bornWhere;
	
	public Forfatter(String navn, int born, int deceased, String bornWhere){
		this.navn = navn;
		this.born = born;
		this.deceased = deceased;
		this.bornWhere = bornWhere;
	}
	
	public String getForfatter(){
		return navn;
	}
	
	public String toString(){
		String s = String.format(" Writer: %s, born in: %s, year:%d - deceased: %d" , this.getForfatter(), this.bornWhere, this.born, this.deceased );
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forfatter f = new Forfatter("HC Andersen", 1820, 1821, "Odense");
		System.out.println(f);
	}

}
