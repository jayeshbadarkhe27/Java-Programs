package string;

public class StringMethods {
	
public static void main(String[] args) {
		
		String j = "Jayesh";
		String s = "jayesh";
		
		//***************equalsIgnoreCase Method*********
		boolean issame = s.equalsIgnoreCase(j);
		System.out.println(issame);                                                       //output= true
		
		String j1 = "jayesh";
		String s2 = "Jayesh";
		
		//**********equals(Strings) Method********
		boolean isidentical = s2.equals(j1);
		System.out.println(isidentical);                                                  //output= false
		
		
	//	***********Char At(int index)************
		String j2 = "jayesh";
		char ch = j2.charAt(2);
		System.out.println(ch);                                                           //output= y
		
		//*********length()**********
		String j4 = "jayesh";
		int size = j4.length();
		System.out.println(size);                                                         //output= 6
		
		//*********substring(begining index)******
		String j5 = "jayesh";
		String s4 = j5.substring(3);
		System.out.println(s4);                                                           //output= esh
		
		
		//*********substring(beginning index, end index) Method**********
		String j6 = "jayesh";
		String s5 = j6.substring(0, 3);                                                //output= jay  ek index m kmiprint hoty..
		System.out.println(s5);
		 
		
		//*********Replace Method**********
		String j7 = "jayesh";
		String s6 = j7.replace("jay","sss");                                          //output = sssesh
		System.out.println(s6);
    
		//**********repeat***********8
		String j8 = "jayesh";
		String s8 = j8.repeat(2);                                                     //output = jayeshjayesh
		System.out.println(s8);
		
		//************toUpperCase();**********
		String j9 = "jayesh";
		String s9 = j9.toUpperCase();
		System.out.println(s9);                                                       //output = JAYESH
		
		//********toLowerCase*********
		String j00 = "JAYESH";
		String s88 = j9.toLowerCase();                                                //output = jayesh
		System.out.println(s88);    
		
		//********Replace(String seq,String new seq)*********
		String j11 = "jayesh";                                                       //output = jayjay
		String s11 = j11.replace("esh","jay");
		System.out.println(s11);
		
		//********Contains*********
		 String j12 = "jayesh";
		 boolean s12=j12.contains("ja");                                             //output = true
		 System.out.println(s12);
		 
		//********trim()*********
		 String j13 = "   Jay   esh  ";
		String s13 = j13.trim();
		System.out.println(s13);                                                    // output = Jay   esh
		
		
		String s14 = j13.replace(" ", "");
		System.out.println(s14);                                                   //output = jayesh
		
		
		//********IndexOf(Char,ch)*********
		String j15 = "jayesh";
		int indexvalue = j15.indexOf("y");                                         //output = 2
		System.out.println(indexvalue);
		
		//**********startwith(String value)********
		String j16 = "jayesh"; 
		boolean s16 = j16.startsWith("ja");                                        //output = true
		System.out.println(s16);
		
		//**********Endwith(String value)********
		String j17 = "jayesh"; 
		boolean s17 = j17.endsWith("ss");                                         //output = false
		System.out.println(s17);
		
		
		//**********toCharray()********
		                                                                         //output = j
//																							a
//																							y
//																							e
//																							s
//	                                                                                        h
		String j18 = "jayesh";  
		char[]stringarray = j18.toCharArray();
		for(char B:stringarray)
		{
			System.out.println(B);
		}

		
}


}
