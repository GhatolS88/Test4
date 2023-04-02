package Star_Pattern;

public class star_9
{	
	//reverse pyramid
	 
	public static void main(String[] args)
	{	
		int  star=7;
		int  space=0;
		
		for(int i=1; i<=4; i++)
		{
			for(int a=1; a<=space; a++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star-2;
			space++;
		}
		
	}

}
