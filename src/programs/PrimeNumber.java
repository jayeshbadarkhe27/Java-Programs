package programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no, i ,fect = 1;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any Number :");
		
         no = s.nextInt();
         if(no==1);
         {
        	 System.out.println("Smallest Prime number is 2");
         }
         for(i=2;i<no;i++)
         {
        	 if(no%i==0)
        	 {
        		 System.out.println("Not Prime");
        		 break;
        	 }
         }
         
         if(no==i)
         {
        	 System.out.println("Prime");
         }


	}

}
