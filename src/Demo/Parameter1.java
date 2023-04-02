package Demo;

public class Parameter1
{
public static void main(String[]args)
{
	Addition();
	Addition();
	Parameter1 G2=new Parameter1();
	G2.Subtraction(14,45);
	G2.Multiplication(34,67);
	
}

public static void Addition()    //without parameter static method;
{
	int a=12;
	int b=23;
	int SUM=a+b;
	System.out.println(SUM);
}

public void Subtraction(int c,int d)     // with parameter Non-static method;
{
int SUB=c-d;
System.out.println(SUB);
}
public void Multiplication(int f,int g)   //with parameter non-static method;
{
int MUL=f*g;
System.out.println(MUL);
}

}
