package Interface;

public interface Interface8
{
	//Type of method we can write in interface
	
void m1();   // abstract method;
//changes to following type ,we can write following also

abstract void m2();         //abstract public void method;
public void m3();           // abstract public void method;
abstract public void m4();

//Static regular method
public static void m5()
{
	System.out.println("Sonali");
}
//main method
public static void main(String[] args)
{
	System.out.println("Akshayani");
}
//default method(complete method)
default void m6()
{
	
	System.out.println("Go"); 

}
}
	