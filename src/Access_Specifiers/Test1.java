package Access_Specifiers;

public class Test1
{
	 //public  is the access Specifiers have a scope within the through the project
   public Test1()
   {
	   
   }
   public int  a=24;
   public void m11()
   {
	   System.out.println("Hi");
   }
   public static void main(String[]args)
   {
	   Test1 T1=new Test1();
	    T1.m11();
	    System.out.println(T1.a);
   }
}
