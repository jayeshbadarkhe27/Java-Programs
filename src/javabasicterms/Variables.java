package javabasicterms;

public class Variables {


		// TODO Auto-generated method stub
		//Numeric
		byte nu = 1;                      // 1 byte
		short roll_number = 2441;         // 2 byte
		int mb_number = 72649464;         // 4 byte
		long Pin_code = 444005;           // 6 byte
		float value =  27.5f;	  // 4 byte
		double price = 2055.55;                // 8 byte
		
		//Non Numeric
		
		char city = 'A';                  // 2 byte
		boolean type = true;              // byte nahi rahtaaa
		boolean t = false;
	    
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Variables j = new Variables();
			
			System.out.println("Number is:"+ j.nu);
			System.out.println(" Student roll_number:"+j.roll_number);
			System.out.println(" Student mb_number:"+j.mb_number);
			System.out.println(" pin code:"+j.Pin_code);
			System.out.println(" percent:"+j.value+"%");
			System.out.println(" cost of pen:"+j.price);
			
			System.out.println("City first char:"+j.city);
			System.out.println("true or false:"+j.type);
			System.out.println("true or false:"+j.t);
			

	}

}
