
public class Bog {
	private String title;
	private Forfatter[] forfattere;
	private Emne emne;
	private int aar;

	public Bog(String title, Forfatter[] forfattere, Emne emne, int aar) {
		this.title = title;
		this.forfattere = forfattere;
		this.emne = emne;
		this.aar = aar;
	}

	public void addForfatter(Forfatter forfattere) {
		
	}
	
	public Forfatter[] getForfatter() {
		return forfattere;
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
		String s = String.format("Book-title: %s. Forfatter: %s. Genre: %s. From %s" , this.getTitle(), this.getForfatter(), this.getEmne(), this.getAar());
		return s;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forfatter f[] = new Forfatter[1];
		f[0] = new Forfatter("Dude Dudeson", 1919, 1223, "Humlebæk" );
		Emne e = new Emne(12, "Love-Story");
		
		Bog b = new Bog("Java for Noobs!", f, e, 1922);
		System.out.println(b);
	}

}
