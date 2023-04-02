package Demo;

public class Task1
{
//Non static regular method call from different class
	public static void main(String[]args)
	{
		System.out.println("Stages of SDLC");
		//Step-|:Create Object
		Task2 S4=new Task2();
		Task3 S5=new Task3();
		Task5 S6=new Task5();
		//Step-||: Call Methods
		S4.Info_gathering();
		S4.Analysis();
		S5.Designer();
		S5.Coding();
		S6.Testing();
		S6.Maintenance();
}
	
}
