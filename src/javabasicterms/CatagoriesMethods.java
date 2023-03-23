package javabasicterms;

public class CatagoriesMethods {

	//a] METHOD WITH NO ARGUMENT AND NO RETURN TYPE ...
		 public static void m1()
		 {
			 System.out.println("METHOD WITH NO ARGUMENT AND NO RETURN TYPE ");
		 }
		 
		 //b] METHOD WITH ARGUMENT AND NO RETURN TYPE ...
		  

			 public static void m2(int a, boolean b)
			 {
				 System.out.println("Two argument Method ");
				 int f = a+2;
				 System.out.println(f);
			 }
			 
			 public static void m3(char c)
			 {
				 System.out.println("One argument Method ");
				 
				 System.out.println("char value is :"+c);
				
			 }
			 
			//C] METHOD WITH NO ARGUMENT AND  RETURN TYPE ...
			 
			  public static int m4()
			  {
					 System.out.println("METHOD WITH NO ARGUMENT AND RETURN TYPE ");
					 String s = "jayesh";
					 String s1 = "Badarkhe";
					 String s2 = s+s1;
					 System.out.println("The value of s2 is :"+s2);
					  int a = 50;
					  
					 return a;
			  }
			  
			  //D] METHOD WITH ARGUMENT AND RETURN TYPE...
			  
			  public boolean m5(int i, int j)
			  {
				  System.out.println("Method with argument and return type");
				  int k= i+j;
				  System.out.println("The value of k : "+k);
				  return false;
				  
			  }
			  

		public static void main(String[] args) {
			
			m1();   
			m2(30,true);
			m3('j');
			System.out.println("*******************************");
			int z = m4();
			int y = z+100;
			System.out.println("the value of y is : "+y);
			System.out.println("**************Direct calling of return type method");
			System.out.println(m4());
	        System.out.println(" ");
			System.out.println("*******************************");
			
			CatagoriesMethods j = new CatagoriesMethods();
			System.out.println(j.m5(1997, 1999));
			
			System.out.println("*******************************");

			
			j.m5(27, 13);
		}

	}

