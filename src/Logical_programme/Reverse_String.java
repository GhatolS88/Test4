package Logical_programme;

public class Reverse_String
{	
	//Reverse string
	public static void main(String[] args)
	{
		String  Name="Sonali"; 
		String   rev="";
		                 // i=5  5>=0    4
				         // i=4  4>=0    3
		                 //i=3    3>=0   2
		                 //i=2    2>=0   1
		                 //i=1    1>=0    0
		                 //i=0    0>=0   -1
		                 //i= -1  -1>=0
		for(int i=Name.length()-1; i>=0; i--)    //size=6-1=5
		{
			rev=rev+Name.charAt(i);  //rev=""+i   //i+l  //il+a  //ila+n  //ilan+o  //ilano+s
					
		}
		System.out.println(rev);  //ilanos
			
			
			
	}

}
