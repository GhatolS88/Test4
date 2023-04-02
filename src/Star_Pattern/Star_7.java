package Star_Pattern;

public class Star_7
{	
	public static void main(String[] args) 
	{	
		int star=5;
		int spaces=0;
		for(int i=1; i<=5;i++)
		{
			for(int a=1;a<=spaces; a++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			 star--;
			 spaces++;
		}
		
	}

}
