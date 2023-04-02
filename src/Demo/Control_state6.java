package Demo;

public class Control_state6
{
	public static void main(String[]args)

	{
		int mark=32;
		if (mark>=70)
		{ 
			System.out.println("Passed in distinction");
		}
		else if(mark>=65) 
		{
			System.out.println("Passed in first class");
		}
		else if(mark>=60)
		{	
			System.out.println("Passed in second class");
		}
		
		else if(mark>=55)
		{	
			System.out.println("Passed in third class");
		}
		else if(mark>=35)
		{	
			System.out.println("pass");
		}
		else
		{	
			System.out.println("Fail");
		}

			
	}


}
