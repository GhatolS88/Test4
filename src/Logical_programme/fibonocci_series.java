package Logical_programme;

public class fibonocci_series
{	
	public static void main(String[] args) 
	{	
		int n=10;
		int a=0;
		int b=1;
				
		System.out.println("fibnocci_series till"+  n  +"terms:");
		
		for(int i=1; i<=n; i++)
		{
			int c=a+b;
			a=b;     //a=1   a=1   a=2  a=3   a=5   a=8   a=13   a=21
			b=c;     //b=1    b=2  b=3  b=5    b=8  b=13   b=21  b=34
			
			System.out.print(c+" ");
		}
		
		
	}

}
