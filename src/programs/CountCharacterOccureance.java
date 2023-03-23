package programs;

public class CountCharacterOccureance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s = "java is java again java again";
		
		char c = 'j';
		
		int count = s.length() -s.replace("j","").length()	;
		
		System.out.println("Number of occurance of 'j' in "+s+" =" +count);

	}

}
