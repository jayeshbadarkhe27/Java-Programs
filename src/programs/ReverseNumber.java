package programs;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//		int no , rev = 0,r,a;
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter any no :");
//		no = s.nextInt();
//		a= no;
//		while(no>0)
//		{
//			r=no%10;
//			rev = rev*10+r;
//			no=no/10;
//		}
		
		 int num = 1234, reversed = 0;
		    
		    System.out.println("Original Number: " + num);

		    // run loop until num becomes 0
		    while(num != 0) {
		    
		      // get last digit from num
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;

		      // remove the last digit from num
		      num /= 10;
		    }
       System.out.println("Reverse :"+reversed);
	}

}
