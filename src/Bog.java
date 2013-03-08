import java.util.ArrayList;

public class Bog {
	private String title;
	private ArrayList<Forfatter> forfattere = new ArrayList<Forfatter>();
	private Emne emne;
	private int aar;

	public Bog(String title, Forfatter forfattere, Emne emne, int aar) {
		this.title = title;
		this.forfattere.add(forfattere);
		this.emne = emne;
		this.aar = aar;
	}

	public void addForfatter(Forfatter forfattere) {
		this.forfattere.add(forfattere);
	}
	
	public String getForfatter() {
		int i = 0;
		String s = "";
		while (this.forfattere.size() > i) {
			s += this.forfattere.get(i).toString();
			s += " \n";
			i++;
		}
		
		return s;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getAar() {
		return aar;
	}
	
	public Emne getEmne() {
		return emne;
	}
	
	public String toString() {
		String s = String.format("Book-title: %s \nForfattere:\n%sGenre: %s \nFrom %s" , this.getTitle(), this.getForfatter(), this.getEmne(), this.getAar());
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forfatter f = new Forfatter("Dude Dudeson", 1919, 1223, "Humleb¾k" );
		Forfatter f1 = new Forfatter("Karsten", 1919, 1223, "Humleb¾k" );
		
		Emne e = new Emne(12, "Love-Story");
		Bog b = new Bog("Java for Noobs!", f, e, 1922);
		b.addForfatter(f1);
		System.out.println(b);
	}

}
