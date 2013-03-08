import java.util.Arrays;

public class Person
{

	private final Cprnr cpr;
	private final String name;
	private String address;
	private double balance;
	private double balanceYtd;
	private double balanceLtd;

	private Laan[] loans = new Laan[0];

	private Reservation[] reservations = new Reservation[0];

	public Person(Cprnr ccpr, String cname, String caddress)
	{
		cpr = ccpr;
		name = cname;
		address = caddress;
	}

	public final void laaner(BogEksemplar book)
	{
		Laan loan = new Laan(this, book);
		final int size = loans.length;
		loans = Arrays.copyOf(loans, size + 1);
		loans[size] = loan;
	}
	
	public final void reserver(Bog book)
	{
		Reservation reservation = new Reservation(book, new NewGregorianCalendar(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH), this);
		final int size = reservations.length;
		reservations = Arrays.copyOf(reservations, size + 1);
		reservations[size] = reservation;
	}
	
	public final String getNavn()
	{
		return name;
	}
	
	public final void regulerSaldo(double newBalance)
	{
		balance = newBalance;
	}
	
	@Override
	public String toString()
	{
		return "Person cpr: " + cpr.toString() + " name: " + name + " adress: " + address + " balance: " + balance;
	}

}
