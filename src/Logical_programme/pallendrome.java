
package Logical_programme;

public class pallendrome
{
	public static void main(String[] args)
	{
		String org="mom" ;  //m(2)  o(1)  m(0)
		
		String   rev="";  //mom
		
		            //i=2         2>=0   1
		             //i=1        1>=0   0
		             //i=0        0>=0   -1
		            // i= -1
		
		for(int i=org.length()-1; i>=0;  i--)
		{
		    	rev=rev+org.charAt(i);  //m(2)  o(1) m(0)
		}
		
		if(rev=="mom")   //if(org.equals(rev))
		{
			System.out.println("Given srting is pallendrome");
		}
		else
		{
			System.out.println("Given string is not pallendrome");
		}
			
		
		
	}

}
 