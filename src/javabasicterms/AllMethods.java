package javabasicterms;

public class AllMethods {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
		{
			System.out.println("Static method m1 calling...");
			m3();         //CALLING m3 METHOD WHICH IS IN THE SAME CLASSS...
			Test3.m5():  // CALLING m5 STATIC METHOD WHICH IS ANOTHER CLASS..
		}
		
	   public static void m3() 
	   {
			System.out.println("Static method m3 calling");
	   }
	   
	   
	 //B] Calling of static method inside non-static method....
	     public void m2()
	     {
	    	 System.out.println("Non-static method m2 calling...");
	    	 m3();
	    	 Test3.m5();   // // CALLING m5 STATIC METHOD WHICH IS ANOTHER CLASS..
	     }
	   
	     
	 //C] Calling of non-static method inside non-static method....
	     
	     
	     public void m4()
	     {
	    	 System.out.println("Non static method m4 calling");
	    	 m2();
	    	 Test3 t = new Test3();      //NON - Static Method m6 from Test3 class
	    	 t.m6();                     // CALLING m6 non- STATIC METHOD WHICH IS ANOTHER CLASS..
	  
	     }
	     
	     
	 //d] Calling of non-static method inside static method....
	     

	     public static void m8()
	     {
	    	 System.out.println("Non static method m8 calling");
	    	 AllMethods p = new AllMethods();  //calling of non static method in static method
	    	 p.m4();
	    	 
	    	 Test3 i = new Test3();      // CALLING m7 non- STATIC METHOD WHICH IS ANOTHER CLASS..
	    	  
	    	 i.m7();
	  
	     }
	   
	   
		public static void main(String[] args) {
		    m1();   //Calling m1 static method    
	 System.out.println("**********************************************************");
		    
		    AllMethods j = new  AllMethods();
		    j.m2();
	System.out.println("********************************************************");
	           
	     AllMethods a = new AllMethods();
	     a.m4();

	     System.out.println("********************************************************");	 
		  m8();

	}

}
