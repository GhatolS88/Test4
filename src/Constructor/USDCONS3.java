package Constructor;

public class USDCONS3 
{
	// Step-I:variable declaration
 int c;
 int d;
 String Sname;
 //step-II:variable initialization
 USDCONS3()
 {
	 c=23;
	 d=45;
 }
 USDCONS3(int a,int b)
 {
	 c=a;
	 d=b;
 }
 USDCONS3(String Studentname)
 {
	 Sname=Studentname;
 }
 //step-III:-Usage
 public void addition()
 {
	 int add=c+d;
	 System.out.println(add);
 }
 public void Multiplication()
 {
	 int MUL=c*d;
	 System.out.println(MUL);
 
}
 public void M1()
 {
	 System.out.println(Sname);
}
}
