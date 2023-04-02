package Star_Pattern;

public class Star_trangle_5
{	
	public static void main(String[] args)
	{	
		int star=1;  //3
		// for row 
		         
		
		        //    1<=4   2
		        //    2<=4   3
		        //3   3<=4
		for(int i=1; i<=4; i++)
		{
			        //1<=2     2
			        //2<=2
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			 star++;
		}
		
	}

}
