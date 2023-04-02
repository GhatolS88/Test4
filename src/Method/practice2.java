package Method;

public class practice2
{ 
	public static void main(String[]args)
	{
		Menu1("Gulabjamun");
		practice2 N7=new practice2();
		N7.addition(23,45);
	
		N7.addition(21,40);
		
		
	}
		public static void Menu1(String Sweatname)
		{
		System.out.println("Sweatname:"+Sweatname);
	}
	public void addition(int a,int b)
	{
	int SUM=a+b;
	
		System.out.println("SUM:"+SUM);
	}


}
