package oops_in_java;

public class Data_hiding {
	
private double balance;
	
	//..........Getter Method.............
	public double getBal()
	{
	  
	balance = 1000.30;
	
	return balance;
}
	 //........Setter Method.....
	
	public void setBal()
	{
		double current_bal = balance - 200;
		System.out.println("Avaliable balance:"+current_bal);
		
	}
	
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Data_hiding t =new Data_hiding();
		double bal = t.getBal();
		System.out.println(" Balance:"+bal);
				t.setBal();
		

	}

}


