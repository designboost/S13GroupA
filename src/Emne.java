
public class Emne {

	/**
	 * @param args
	 */
	
	private int nr;
	private String navn;
	
	public Emne(int nr, String navn){
		this.nr = nr;
		this.navn = navn;
	}
	
	public String toString(){
		String s = String.format("%d %s" , this.nr, this.navn);
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emne e = new Emne(22, "bobby");
		System.out.println(e);
	}

}
