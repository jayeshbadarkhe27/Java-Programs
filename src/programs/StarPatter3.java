package programs;

public class StarPatter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int space =8;
			for(int i=1; i<=5; i++)
			{
				for(int  j=1 ; j<=i ;j++)
				
					System.out.print("*");
				
				
				for(int j=1;j<=space;j++)
	        	{
	        		System.out.print(" ");
	        	}
	        	
	        	for(int j=1;j<=i;j++)
	        	
	        		System.out.print("*");
	        	
	        	
	        	System.out.println();
	        	space = space-2;
			}
		
	}

}
