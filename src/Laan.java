import java.util.Calendar;
import java.util.Date;

public class Laan {
	private final Person loaner;
	private final BogEksemplar bookExample;
	private final Calendar dateOut;
	private Date dateHome;
	
	private double fine;
	
	public Laan(Person cloaner, BogEksemplar cbookExample)
	{
		loaner = cloaner;
		bookExample = cbookExample;
		dateOut = Calendar.getInstance();
	}
	
	public final Person getLaaner()
	{
		return loaner;
	}
	
	public final Date returneresDato()
	{
		return dateHome;
	}
	
	public final void returnerer()
	{
		dateHome = new Date();
		dateHome.setTime(System.currentTimeMillis());
	}
	
	public final void returned(int yr, int month, int day)
	{	
		dateHome = new Date();
		dateHome.setYear(yr);
		dateHome.setMonth(month);
		dateHome.setDate(day);
	}
	
	@Override
	public String toString()
	{
		return "Loaner: " + loaner.toString() + " bookexample: " + bookExample.toString() + "date loaned: " + dateOut.toString() + " returned " + ((dateHome != null) ? "yes" : "no"); //TODO:
	}
	
	public int antalDage()
	{
		long miliseconds = dateOut.getTimeInMillis() - dateHome.getTime();
		return (int) (miliseconds / 1000 / 60 / 60 / 24);
	}
	
	public double boregnBoede()
	{
		return fine * antalDage();
	}
	
	public static void main(String[] args) 
	{
		Forfatter f[] = new Forfatter[2];
		f[0] = new Forfatter("Fishy Joe", 1970, 2011, "New York" );
		f[1] = new Forfatter("Karl Johansen", 1656, 1714, "Aarhus" );

		Emne e = new Emne(22, "Fisk");
		BogEksemplar  be = new BogEksemplar("Noget omkring fisk", f, e, 1, 2);
		Cprnr cpr = new Cprnr(123464-2312);
		Person loaner = new Person(cpr, "Jonas", "Denmark");
		Laan loan = new Laan(loaner, be);
		
		System.out.println(loan);
	}
}
