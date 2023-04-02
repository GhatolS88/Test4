package Polymorphism;

public class Method_Overriding1
{
public static void main(String[] args)
{
	Son S1=new Son();
	S1.Bike();
	S1.Car();
	S1.Money();
	S1.Home();
	S1.Gold();
	S1.m1();
	{
		System.out.println("----------------------");
	}
	 
	Method_overrideing M1=new Method_overrideing();
	M1.Car();
	M1.Gold();
	M1.Home();
	M1.Money();
	M1.m1();
}
}
