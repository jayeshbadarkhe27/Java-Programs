package conditonal_statement;

public class Conditional_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		  int b= 3;
		  int k = a%b;
		  System.out.println(k);
		  
       if(a>b)
       {
      	 System.out.println("if block is running");
      	
       }
       
       else
       {
      	 System.out.println("else block is running");
       }
		
       if(a>=b) {
      	 System.out.println("second if block is running");
       }
       else
       {
      	 System.out.println("second else block is running");
       }
       

       if(a==b) {
      	 System.out.println("Third if block is running");
       }
       else
       {
      	 System.out.println("Third else block is running");
           
       }
       if(a>b && a<b)
       {
      	 System.out.println("First logical if block is running");
       }
       else
       {
      	 System.out.println("Fist logical else if block is running");
       }
		
	}

}
