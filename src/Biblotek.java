
public class Biblotek {
	private BogEksemplar[] bogBestand;
	private Person[] laanere;
	private Ansat[] ansatte;
	private String navn; 
	
	public Biblotek() {
		// TODO Auto-generated constructor stub
	}
	
	public <bogBestand> void addBog(Bog bogEksemplar) {
		BogEksemplar b = new BogEksemplar();
	}
	
	public <ansat> void addAnsat(Ansat ansatte) {
		Ansat a = new Ansat("Biblotekar", "Fisk");
	}
	
	public <laanere> void addLaanere(Person laanere) {
		laaner l = new Person("Biblotekar", "Fisk");
	}
	
	public void udskrivBogliste() {
		
	}
	
	public void udskrivLaanere() {
		
	}
	
	public void udskrivAnsatte() {
		
	}
	
	public String toString() {
		//String s = String.format("Ansatte: %s", this.udskrivAnsatte() );
		return null;
	}
	
	public static void main(String[] args) {
		
		
	}

}
