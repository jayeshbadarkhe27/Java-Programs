package arraydiscussion;

public class Add {
	

	public static void main(String[] args) {
		
      int []a = new int[5];
      a[0] = 10;
      a[1] = 20 ;
      a[2] = 30 ;
      a[3] = 40 ;
      a[4] = 50 ;
      
      System.out.println(a[3]);
      System.out.println(a[5-1]);
     
      System.out.println("***********************************************");
      for(int i=0;i<5;i++)
      {
    	  System.out.println(i);
      }
      
      
      System.out.println("***********************************************");
      for(int i=5;i>=0;i--)
      {
    	  System.out.println(i);
      }
      
      System.out.println("***********************************************");
      
      for(int j :a)
      {
    	  System.out.println(j);
      }
      
      
      System.out.println("***********************************************");
      
      for(int d :a)
      {
    	  if(d==40)
    	  {
    		  break;
    	  }
    	  System.out.println(d);
         }
      
      System.out.println("***********************************************");
      System.out.println(a.length);
      
      
	}


}
