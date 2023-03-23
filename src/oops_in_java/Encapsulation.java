package oops_in_java;

public class Encapsulation {

	
	private int balance = 100;

  public void getBalance(String name, int pincode)
  {
	if(pincode == 2713)
	{
		System.out.println("Avaliable Bank Balance :"+balance);
	}
	else
	{
		System.out.println("Please enter the correct password");
	}
  }
  public void setBalance(int balance, int withdrawlamount)
  {
	  int current_balance  = balance - withdrawlamount;
	  System.out.println("withdrawl amount is :"+current_balance);
  }
	
	
}
