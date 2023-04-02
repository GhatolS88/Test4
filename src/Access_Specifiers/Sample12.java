package Access_Specifiers;

public class Sample12
{
	// default access specifire access in same package same calss
	Sample12()
	{
		
	}
	int a=56;
	void m5()
	{
		System.out.println("Morning");
		
	}
	public static void main(String[]args)
	{
		Sample12 S12=new Sample12();
				S12.m5();
		System.out.println(S12.a);
	}

}
