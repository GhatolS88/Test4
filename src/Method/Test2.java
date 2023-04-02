package Method;

public class Test2
// static regular method call from same class
{
public static void main(String[]args)
{
	m1(); //main method;
	m2(); // main method;
}
 // static regular method
public static void m1()
{
	System.out.println("m1 method call from same class");
}
//static regular method
public static void m2()
{
	System.out.println("m2 method call from samee class");
}
}