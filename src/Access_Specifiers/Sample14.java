package Access_Specifiers;

public class Sample14
{
// protected access_specifire 
	
	protected Sample14()
	{
		
	}
	protected int a=12;
	protected void m5()
	{
		System.out.println("BYe");
	}
	public static void main(String[] args)
	{
		Sample14 S14=new Sample14();
		  S14.m5();
		  System.out.println(S14.a);
	}
}
