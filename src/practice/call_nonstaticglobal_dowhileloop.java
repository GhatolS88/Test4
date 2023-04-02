package practice;

public class call_nonstaticglobal_dowhileloop
{
//print the table 134
	
	
	public static void main(String[]args)
	{
		non_static_globalvariable F1=new non_static_globalvariable();
		
				do
		
			{
				//create object
			
	
			System.out.println(F1.i);
			F1.i=F1.i+134;
			}
			
		while(F1.i<=1340);
		
	}
}
