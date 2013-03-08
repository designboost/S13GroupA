public class Cprnr {
	private final long cprnr;
	
	public Cprnr(long ccprnr)
	{
		cprnr = ccprnr;
	}
	
	public final long getCprnr()
	{
		return cprnr;
	}
	
	public final boolean checkCpr()
	{
		long sum;
        long restcpr = cprnr;
        sum = 0L;

        sum += (restcpr % 10) * 1;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 2;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 3;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 4;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 5;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 6;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 7;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 2;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 3;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 4;
        restcpr = restcpr / 10;
        if (sum % 11 == 0 && sum != 0)
          return true;
        else
          return false;

	}
	
	@Override
	public String toString()
	{
		return "cpr nr: " + cprnr;
	}
}
