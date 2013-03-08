public class BogEksemplar extends Bog {
	private int eksplNr;
	
	public BogEksemplar(String title, Forfatter forfattere, Emne emne, int aar, int eksplNr) {
		super(title, forfattere, emne, aar);
		this.eksplNr = eksplNr;
	}

	public int getEksemplar() {
		return eksplNr;
	}
	
	public String toString() {
		String s = String.format("Eksemplar Nummer: %40s" , this.getEksemplar());
		return s;
	}
	
	public static void main(String[] args) {
		Forfatter f = new Forfatter("Fishy Joe", 1970, 2011, "New York" );

		Emne e = new Emne(22, "Fisk");
		BogEksemplar  be = new BogEksemplar("Noget omkring fisk", f, e, 1, 10);
		
		System.out.println(be);
	}
}
