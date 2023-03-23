package objectinjava;

public class CallMethod {

	int value = 10;
	String secondvalue = "Jayesh";

	public void show(){
		
		System.out.println("Name of student :"+secondvalue);
		System.out.println("Marks is :"+value);

	}
   public static void main(String[]args) {
	   CallMethod t = new CallMethod();                                       //object Creation
	   
	   t.show();                                                               //calling non static methods which in same class
	   System.out.println("****************");
	   System.out.println(t.value);
	
   }
	
}
