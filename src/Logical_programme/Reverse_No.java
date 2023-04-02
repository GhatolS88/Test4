package Logical_programme;

public class Reverse_No
{	
	public static void main(String[] args) 
	{	
		int org=1234;   //4321
		 int rev=0;
		 //i=1234      1234>0   1234/10=123.4
		 //123         123>0    123/10=12.3
		 //            12>0      12/10=1.2  
		 //             1>0      1/10=0.1
		 //             0>0
		 for(int i=org; i>0;  i=i/10)
		 {
			   //4     // 1234%10=123.4
			    //3    	//123%10=12.3
			     //2       //12%10=1.2
			 //  1           1/10=0.1
			 int  rem=i%10;
			 
			 rev=rev*10+rem;  //4321
		 }
		 System.out.println(rev);  
		
	}

}
