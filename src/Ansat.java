

public class Ansat extends Person {	
	
			private String Stilling;
		    private String Speciale;
				    
	
	
		
		public Ansat(Person p,String Stilling, String Speciale)
		{
		 super(p.cpr, p.name);
		 this.Stilling=Stilling;
		 this.Speciale=Speciale;
		 
		}
		
	
		public String getStilling() {
			return this.Stilling;
		}
		
		public String getSpeciale()
		{
		  return this.Speciale;
		}
		
		
		@Override
		public String toString() {
			String s = this.Stilling + " " + this.Speciale;
			return s;
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Cprno cpr1 = new Cprno(311882945);
				Person p1 = new Person(cpr1, "Lucas","lector","it");
				System.out.println(p1.toString());
				}

}
	