package Star_Pattern;

public class Star_4 
{	
	public static void main(String[] args)
	{	
		int star=1;
		int spaces=3;
		for(int i=1; i<=4; i++)
		{	
			for(int a=1; a<=spaces; a++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
			spaces--;
		}
		
		
	}

}
