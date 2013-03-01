/**
 * @author Asbj¿rn
 *
 * Filled out according to the UML diagram on 
 * http://deformation.org/pbawu/idefix/site/ch04s03.html
 * 
 */
public class Ansat {
	private String stilling;
	private String speciale;

	public Ansat(String stilling, String speciale) {
		this.stilling = stilling;
		this.speciale = speciale;
	}

	public String getStilling(){
		return stilling;
	}

	public String toString(){
		String s = String.format("Stilling: %s", this.getStilling() );
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ansat a = new Ansat("Biblotekar", "Romaner");
		System.out.println(a);
	}

}