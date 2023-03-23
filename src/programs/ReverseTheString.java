package programs;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str = "Jayesh Badarkhe";
		
		char[] strArray = str .toCharArray();
		
		for (int i = strArray.length -1 ; i>=0; i--)
		{
			
			System.out.print(strArray[i]);
		}
        System.out.println();

	}

}
