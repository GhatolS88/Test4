package Logical_programme;

public class White_spaces
{	
	public static void main(String[] args)
	{	
		String org="ab c d  ";   //0  1  2 3 4 5 6 7 8
		int Count=0;
		 //           0<=8     1
		           //1<=8       
		for(int i=0;  i<=org.length()-1;   i++) 
		{
			     char     charvalue=org.charAt(i);
			     
			     if(charvalue==' ')
			     {
			    	 Count++;
			    
			     }
		  }
		System.out.println(Count);
	}

}
