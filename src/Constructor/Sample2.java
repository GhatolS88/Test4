package Constructor;

public class Sample2
{
	//Use-i: constructor->copy/load the member of class into object----during create object
	// Sample(){}------------------->default constructor
public static void main(String[]args)
{
	//create object
	Sample2 S2=new Sample2();
	//call method
	S2.Multiplication();
	
}

public void Multiplication()     
{
	int a=34;        // local variable
	int b=12;        // local variable
	int Mulvalue=a*b;
	System.out.println(Mulvalue);
}
}
