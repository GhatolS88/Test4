package Logical_programme;

public class Armstrong_No
	
{	
	public static void main(String[] args)
	{	
		int a=153; 
		          //1^3+5^3+3^3=3+125+27=153
		int add=0;
		
		//i=153    153>0     153/10=15.3
		//i=15       15>0      15/10=1.5
		// i=1          1>0    i=1/10=0.1
		
		for(int i=a; i>0; i=i/10)
		{
			int rem=i%10;  //153%10=15.3
			               //15%10=1.5
			               //1%10=0.1
			add=add+(rem*rem*rem);  //27  //125  //1
			
		}
		if(a==add)
		{
			System.out.println("Given No is Armstrong_No");
		}
		else
		{
			System.out.println("Given no is nt Armstrong_No");
		}
	}

}
