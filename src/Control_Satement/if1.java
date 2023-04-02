package Control_Satement;

public class if1
{
public static void main(String[]args)
{
	int mark=40;   //variable declaration and Initialisation
	//40>=45 ----------->True
	if (mark>=45)
	{
		System.out.println("pass");
	}
	
	else if(mark>=35)
	{
		System.out.println("Secondclass");
	}
	else
	{
		System.out.println("Fail");
	}
	
}
}
