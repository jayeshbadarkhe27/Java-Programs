package constructorinjava;

public class Constructors {

	public Constructors()
	{
		this(500);
		System.out.println("zero argument Constructors");
	}
	
	public Constructors(int i)
	{
		this("Jayesh",27,13);
		System.out.println("One argument Constructors");
	}
	
	public Constructors(String s,int i, int j)
	{
		
		System.out.println("One argument Constructors");
		s= s+ "CTC Testing";
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Constructors c = new  Constructors();
		// Constructors c1 = new Constructors();
	    //Constructors  c2 = new Constructors("Nexus",50,80);

	}

}
