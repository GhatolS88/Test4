package Access_Specifiers;

public class flask1
{
	//private access Specifire
	private flask1()
	{
	}
	private int a=10;
	private void m4()
	{
		System.out.println("go");  
	}
	
public static void main(String[]args)
{
	flask1 F1=new flask1();
	F1.m4();
	System.out.println(F1.a);
}
}
