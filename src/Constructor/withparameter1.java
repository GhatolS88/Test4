package Constructor;

public class withparameter1
{
int a;  // non-static global variable;
int b;
String Sname;
withparameter1()  //zeroparameter constructor
{
	a=10;
	b=34;
}
withparameter1(String name,int u,int v)  
{
	this.Sname=name;
	this.a=u;
	this.b=v;
}
withparameter1(int c,int d)
{
  a=c;
  b=d;
}
public void m3()
{
	int SUM=a+b;
	System.out.println(SUM);
	System.out.println("Sname:"+Sname);
	System.out.println(a);
	System.out.println(b);
}
public static void main(String[]args)
{
	withparameter1 w1=new withparameter1();
	w1.m3();
	
	withparameter1 w2=new withparameter1("sonali",22,45);
	w2.m3();
}

}
