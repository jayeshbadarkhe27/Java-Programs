package programs;

public class ReverseRLTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 

		 int space =0;
			for(int i=5; i>=1; i--)
			{
				for(int  j=i ; j>=1 ;j--)
				
					System.out.print("*");
				
				
				for(int j=1;j<=space;j++)
	        	{
	        		System.out.print(" ");
	        	}
	        	
	        	for(int j=i;j>=1;j--)
	        	
	        		System.out.print("*");
	        	
	        	
	        	System.out.println();
	        	space = space+2;
	}

	}}
