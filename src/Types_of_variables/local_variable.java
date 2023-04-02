package Types_of_variables;

public class local_variable
{
	public static void main(String[]args)
	{
		int a=20;
		System.out.println(a);
		m1();
		local_variable n2=new local_variable();
		n2.m2();
	}
public static void m1()
{
	int b=23;
	int c=12;
	int SUM=b+c;
			
	System.out.println(SUM);	
	
}
public void m2()
{
  m1();
}
}
