package Constructor;

public class Akshu_Demo1
{	
	int x;
	int y;
	String EmpyName;
	int EmpyID;
	char performance;
	
	Akshu_Demo1()
	{
		x=12;
		y=23;
		
	}
	Akshu_Demo1(String Ename, int EID,char grade)
	{
		EmpyName=Ename;
		EmpyID=EID;
		performance=grade;
		System.out.println("EmpyName:"+EmpyName+" "+"EmpyID:"+EID+" "+"performance:"+grade);
	}
	public void Multiplication()
	{
		int MUL=x*y;
		System.out.println("MUL:"+MUL);
	}
	
	public static void main(String[] args) 
	{	
		Akshu_Demo1  AD=new  Akshu_Demo1();
		AD.Multiplication();
		
		Akshu_Demo1  AD1=new  Akshu_Demo1("sonali",4,'A');
		
		
	}
	
	
	
	
	
	
	

}
