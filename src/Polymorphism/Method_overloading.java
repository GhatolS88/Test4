package Polymorphism;

public class Method_overloading
{
public void m1()
{
	System.out.println("HI");
}
public void m2(int a)
{
	System.out.println("Hello");
}

public void m3(String Sname,char b)
{
	System.out.println("Goodmorning");

}
public static void m4(String name )
{
	System.out.println("Goodafternoon");
}
public static void main(String[] args) 
{
	Method_overloading O1=new Method_overloading();
	        O1.m1();
	        Method_overloading O2=new Method_overloading();
	        O2.m2(22);
	        Method_overloading O3=new Method_overloading();
	        O3.m3("sonali",'A');
	        m4("Guddi");
	        
}
}
