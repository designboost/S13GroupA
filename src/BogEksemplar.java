public class BogEksemplar extends Bog {
	private int eksplNr;
	
	public BogEksemplar() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		BogEksemplar b = new BogEksemplar();
        System.out.println(b);
        */

	}

	public int getEksemplar() {
		return eksplNr;
	}
	
	public String toString() {
		String s = String.format("Eksemplar Nummer: %40s" , this.getEksemplar());
		return s;
	}

}
