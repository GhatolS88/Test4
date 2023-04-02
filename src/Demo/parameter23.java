package Demo;

public class parameter23
{
public static void main(String[] args)
{
	m1();
	parameter23 v1=new parameter23();
		v1.m2();
	
}


public static void m1()
{
	System.out.println("hi");
	
}
public void m2()
{
	System.out.println("hello");
	m1();
}
}