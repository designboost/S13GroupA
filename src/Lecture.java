
public class Lecture<Ansat> {

	/**
	 * @param args
	 */
	private String title;
	protected Ansat lecturer;
	private String description;
	private int duration;
	
	
	public Lecture(String title,Ansat lecturer,int duration)
	{
		this.title=title;
		this.lecturer=lecturer;
		this.duration=duration;
			
	}
		
	public String getTitle()
	{
		return this.title;
	}
	public String getLecture()
	{
		return this.lecturer.toString();
	}
	public void setDesc(String desc)
	{
		description=desc;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
