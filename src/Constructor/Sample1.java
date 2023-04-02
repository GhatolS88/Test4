package Constructor;

public class Sample1
{
	// user defined constructor:-copy/load  the member of class into object
// step-i:variable declaration
	
	int a;        //non static global variable;
	int b;         //non static global variable;
	// Step-ii:variable initialization
	Sample1()            // user defined constructor
	{
		a=23;
		b=12;
	}
	
	public void addition()
	{
		int SUM=a+b;
		System.out.println(SUM);
	}
	public static void main(String[]args)
	{
		// create object
		Sample1 S1=new Sample1();
		// call method
		S1.addition();
	}
}


