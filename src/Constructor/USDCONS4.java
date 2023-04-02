package Constructor;

public class USDCONS4
{
public static void main(String[] args) 
{
	USDCONS3 U3=new USDCONS3();
			U3.addition();
	        U3.Multiplication();
	
	USDCONS3 U4=new USDCONS3(46,67);
			U4.Multiplication();
			U4.addition();
			
			USDCONS3 U6=new USDCONS3(12,23);
			
			U6.addition();	

			USDCONS3 U5=new USDCONS3("sonali");
					U5.M1();
					
}
}
