package programs;

import java.util.Scanner;

public class OldEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number :");
		no=s.nextInt();
		if(no%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}

	}

}
