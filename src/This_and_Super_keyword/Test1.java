package This_and_Super_keyword;

public class Test1 extends Test2
{
	// subclass
	// int a=40;
	// int b=50;
	// int c=56;
int a=10;
int b=30;



public void m1()
{
	int c=11;
	System.out.println(c); 
	System.out.println(a);
	System.out.println(a);
	System.out.println(b);
	System.out.println(this.a);
	System.out.println(this.b);
	System.out.println(super.a);
	System.out.println(super.b);
	System.out.println(this.c); 
	System.out.println(super.c); 
}
public static void main(String[] args)
{
	Test1 T1=new Test1();
	   T1.m1();
}
}