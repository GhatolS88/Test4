package practice;

public class star1 
{
	public void m1()
	{
		           //  1<=5;
		for(int i=1; i<=5; i=i+1)
		{  
			     //0>1 ;j=0
			    //2>=1; j=1
			  //3>=1 ; j=2
			   //4>=1; j=3
			          //5>=1;   j=4
			for(int j=5; j>=i; j=j-1)
			{
				System.out.print(" ");
			}
			
			        
			for(int k=1; k<=i; k=k+1)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
