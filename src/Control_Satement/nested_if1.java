package Control_Satement;

public class nested_if1
{
public static void main(String[] args)
{
	int Weight=65 ;
	int Age=20 ;
	{
		if (Weight>=45)
		{
			System.out.println("Eligible candidate for Blood donation "); 
		if(Age>=18)
		
		{
			System.out.println("Correct Age for Blood donation");
		}
		else
		{
			System.out.print("InCorrect Age for Blood donation");
		}
	   }
    else
    {
	System.out.println("NOT Eligible candidate for Blood donation");
     }
  }
  }
}
