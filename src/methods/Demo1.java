package methods;

public class Demo1
{
// Non static regular method call from same class
public static void main(String[]args)
{
 Demo1 S1=new Demo1();
        S1.M1(); //objectname.classname
        S1.M2();
        S1.M3();
}
// Non static regular method
public void M1()
{
	System.out.println("sonali");
}
public void M2()
{
	System.out.println("Hello");
	
}
public void M3()
{
	System.out.println("HII");
}
}