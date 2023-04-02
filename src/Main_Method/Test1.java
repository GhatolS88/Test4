package Main_Method;

public class Test1
{
	// return type
public static void main(String[] args) 
{
	
	int Num=addition(20,30);//50//after return the output we declare object like Num which datatype int
	System.out.println(Num);
}
public static int addition(int a,int b) //------change return type (void --->int)
{
	int Sum=a+b;   //20+30=50
	System.out.println(Sum);    
	return Sum;                       // if we have to return the output from this method then we can use return keyword
}
}
