package javabasicterms;

public class MethodsInJava {
	
	//NOTES ==>
		//1]- STATIC MATHODS - TO CALL A STATIC METHOD WHICH IS DEFINE IN SAME CLASS WE CAN CALL BY DIRECTLY METHOD NAME..
		
		//2]- STATIC MATHODS - TO CALL A STATIC METHOD WHICH IS DEFINE OUTSIDE THE CLASS THEN WE CAN CALL IT BY CLASSNAME.METHOD NAME..
		
		public static void m1()
		{
			System.out.println("Static Method m1 Calling");
			
		}
		
		public static void m3()
		{
			System.out.println("Static method m3 calling");
		}
		
		
	    //====>  NOTES
		//1]- NON-STATIC MATHOD - A METHOD WHICH ALWAYS GET CALL BY OBJECT CREATION. IT CANNOT BE CALL WHEN WE DO NOT HAVE AN OBJECT..
		
		public void m2()
		{
			System.out.println("Non- static method m2 calling");
		}
	     
		public static void main(String[] args) {
	      
			m1();                       //CALLING M1 STATIC METHOD .......
			
			m3();                       //CALLING M3 STATIC METHOD........
			
			Test3.m5();                 //CALLING M5 METHOD WHICH IS IN ANOTHER CLASS......
			
			Test3 jb = new Test3();    //CALLING M6 NON-STATIC METHOD IS IN ANOTHER CLASS
		    jb.m6();
		    
		    System.out.println(" ");
		    
		    System.out.println("**********CALLING ALL NON STATIC METHODS*********");
		    
		    MethodsInJava ns = new MethodsInJava(); //CALLING M2 NON STATIC METHOD IS SAME CLASS........
		    ns.m2();
		    
		    Test3 n = new Test3();                 // CALLING NON - Static Method m7 from Test3 class (ANOTHER CLASS).....
		    n.m7();
		}

	} 



