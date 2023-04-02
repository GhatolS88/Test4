package Access_Specifiers;

public class Sample1 
{
	
    public  int a=23;
    
    public static void main(String[] args) 
    {
		Sample1 S1=new Sample1();
		        System.out.println(S1.a);
		        S1.m2();
	}
    public void m2()
    {
    	System.out.println(a);
    }
}
