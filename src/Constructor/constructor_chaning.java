package Constructor;

public class constructor_chaning 
{
	String Sname;
	int Rollno;
	int Mark;
	constructor_chaning()
	{
		
	}
constructor_chaning(String name)
{
	Sname=name;
	System.out.println("Sname:"+Sname); 
}
constructor_chaning(String d,int a)
{
	 this();
	Rollno=a;
		
	System.out.println("Rollno:"+Rollno);

}
constructor_chaning(String name,int b,int c) 
{	
	this();
	
	Mark=c;
	
	System.out.println("Mark:"+Mark);
}		

public static void main(String[] args) 
{
	constructor_chaning C1=new constructor_chaning("Sonali");
	constructor_chaning C2=new constructor_chaning("Sonali",12);
	constructor_chaning C3=new constructor_chaning("Sonali",12,89);
	
}
}
