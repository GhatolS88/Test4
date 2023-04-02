package for_loop;

public class primeno
{
public static void main(String[] args) 
{
	int i,number,count;
	System.out.println("Prime no from 1 to 100 are:");
	for(number=1;number<=100;i++)
	{
		count=0;
		for(i=2;i<=number/2;i++)
		{
			if(number % i==0)
			{
				count++;
				break;
			}
		}
		if(count==0 && number !=1)
		{
			System.out.print(number +" ");
		}
	}
} 
}
