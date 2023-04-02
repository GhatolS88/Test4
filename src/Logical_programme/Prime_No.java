package Logical_programme;

public class Prime_No
{	
	  public static void main(String[] args)
	  {	
		  //prime no are those no divide by 1 or divide by itself only.
		  int org=7;       //1  2 3 4 5  6  7
		  int Count=0;
		                  //  2<7   3
		           //i=3      3<7   4
		           //i=4      4<7   5
		           // i=5     5<7    6
		            //i=6     6<7
		  for(int  i=2;   i<7;  i++)
		  {
			   
			  if( org%i==0)
			  {
				  Count++;
				  break;
			  }
				  
				  
		  }
		  if(Count==1)
		  {
			  System.out.println("Given no is not prime no");
		  }
		  else
		  {
			  System.out.println("Given no is prime no");
		  }
		  
		  
		
	  }	

}
