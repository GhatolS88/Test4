package Star_Pattern;

public class Star_11
{	
	public static void main(String[] args)
	{	
		int star=5;
		int space=0;
		
		for(int i=1; i<=9; i++)
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
			
			if(i<=4)
			{
			star--;
			space++;
			
		    }
			else
			{
				star++;
				space--;
			}
		
	    }

     }
}
	