import java.util.ArrayList;

public class Biblotek {
	private ArrayList<Person> laanere = new ArrayList<Person>();
	private ArrayList<BogEksemplar> bogBestand = new ArrayList<BogEksemplar>();
	private ArrayList<Ansat> ansatte = new ArrayList<Ansat>();
	private String navn; 
	
	public Biblotek(Person laanere, BogEksemplar bogBestand, Ansat ansatte, String navn) {
		this.laanere.add(laanere);
		this.bogBestand.add(bogBestand);
		this.ansatte.add(ansatte);
		this.navn = navn;
	}
	
	public void addBog(BogEksemplar bogEksemplar) {
		this.bogBestand.add(bogEksemplar);
	}
	
	public void addAnsat(Ansat ansatte) {
		this.ansatte.add(ansatte);
	}
	
	public void addLaanere() {
	}
	
	public void udskrivBogliste() {
		int i = 0;
		String s = "";
		while (this.bogBestand.size() > i) {
			s += this.bogBestand.get(i).toString();
			s += " \n";
			i++;
		}
		
		System.out.println(s);
	}
	
	public void udskrivLaanere() {
		int i = 0;
		String s = "";
		while (this.laanere.size() > i) {
			s += this.laanere.get(i).toString();
			s += " \n";
			i++;
		}
		
		System.out.println(s);
	}

	public void udskrivAnsatte() {
		int i = 0;
		String s = "";
		while (this.ansatte.size() > i) {
			s += this.ansatte.get(i).toString();
			s += " \n";
			i++;
		}
		
		System.out.println(s);
	}

	public String toString() {
		String s = String.format("Person: %s\n Navn: %s", this.laanere, this.navn );
		return s;
	}
	
	public static void main(String[] args) {
		Ansat a = new Ansat("Bibliotekar", "Dorthe");
		Emne e = new Emne(12, "Love-Story");
		Forfatter f = new Forfatter("Dude Dudeson", 1919, 1223, "Humleb¾k" );
		BogEksemplar be = new BogEksemplar("navn2", f, e, 2, 4);
		Biblotek b = new Biblotek("navn", be, a, "navn");
		System.out.println(b);
		
		b.udskrivAnsatte();
		b.udskrivBogliste();
	}

}
