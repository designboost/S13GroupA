
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

	public void addForfatter(forfatter: Forfatter) {
		
	}
	
	public String getForfatter() {
		String s = "Something";  // Put return value here
		return s;
	}
	
	public String getTitle() {
		String s = "something"; // Put return value here
		return s;
	}
	
	public int getAar() {
		int i = 1; // Put return value here
		return i;
	}
	
	public Emne getEmne() {
		
	}
	
	public String toString() {
		String s = String.format("Forfatter: %40s" , this.getForfatter());
		return s;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bog b = new Bog("title", "hello", "Krimi", int 4);
		System.out.println(b);
	}

}
