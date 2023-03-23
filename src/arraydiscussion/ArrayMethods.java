package arraydiscussion;

public class ArrayMethods {
	

	 static String s1= "abcd";
	
	public static void m1(String[]d) {
		// TODO Auto-generated method stub
		for(String ss:d)
		{
			System.out.println(ss);
		}
	}
	
	public int[] m2()
	{
		int i [] = new int [3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		
		return i;
	}

	public static void main(String[] args)
	{
		String []s = new String[2];
		s[0]="jay";
		s[1]="esh";
		
	}

}
