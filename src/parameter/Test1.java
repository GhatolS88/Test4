package parameter;

public class Test1
{
public static void main(String[]args)
{
	Addition(10,15);
	Subtraction(56,32);
	Test1 T=new Test1();
	T.Multiplication();
	
}

public static void Addition(int a, int b)
{
int SUM=a+b;
System.out.println(SUM);
}
public static void Subtraction(int c,int d)
{
	int SUB=c-d;
	System.out.println(SUB);
}
public void Multiplication()
{
	int f=23;
	int g=12;
	int MUL=f*g;
	System.out.println(MUL);
	
}
}