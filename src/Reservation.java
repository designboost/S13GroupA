/**
 * 
 */

/**
 * @author Susanne
 *
 */
public class Reservation {
	
	private Bog bog;
	private NewGregorianCalendar dato;
	private Person laaner;

	/**
	 * @param args
	 */
	
	/**
     * Constructor
     */
    public Reservation (Bog bog, NewGregorianCalendar dato, Person laaner) {
        this.bog = bog;
        this.dato = dato;
        this.laaner = laaner;
    }
    
    /**
     * Accessor methods
     */
    
    public NewGregorianCalendar getDato() {
        return this.dato;
    }
    
    public String toString() {
        String s = String.format("%12s %40s: %6d", this.laaner, this.bog, this.getDato());
        return s;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bog b1 = new Bog ("HTML5 for dummies", "Mickey Mouse", "Live saver", 2010);
		NewGregorianCalendar d1 = new NewGregorianCalendar (2011, 8, 12);
		Person l1 = new Person (1012883706, "Minnie Mouse", "Entenhausen");
		Reservation r1 = new Reservation (b1,d1, l1);
		System.out.println(r1);

	}

}
