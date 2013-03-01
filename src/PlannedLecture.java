
public class PlannedLecture {

	/**
	 * @param args
	 */
	protected Lecture lecture;
	private String forum;
	protected NewGregorianCalendar calendar;
	private double entryFee;
	
	public PlannedLecture (Lecture lecture,NewGregorianCalendar calendar,double entryFee)
	{
		this.lecture=lecture;
		this.calendar=calendar;
		this.entryFee=entryFee;
	}	
		
	public void SetForum(String forum1)
	{
		forum=forum1;
	}
		
	public String toString() {
		String s = this.forum + " " + this.entryFee;
		return s;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlannedLecture pLec = new PlannedLecture("Svend", "test", 22);
		System.out.println(pLec);
	}

}
