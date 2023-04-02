package Array;

public class String3
{
	public static void main(String[] args)
	{
		//Array Declaration
		//Array initialization
		//Usage
		
		//Array declaration
		String Str1[]= new String[4];
		
		//Array initialization
		
		Str1[0]="Sonali";
		Str1[1]="Ronali";
		Str1[2]="Monali";
		Str1[3]="Nonali";
		
		//Array Usage
		// To get the size of Array  
		//Size=index+1;
		//index=size-1;
		
		System.out.println(Str1.length); //4
		// To get last index of Array
		System.out.println(Str1.length-1 );   //4-1=3
		            //   0<=3       1
		            //  1<=3        2
		             //  2<=3;      3
		              // 3<=3        4
		             //  4<=3
		for(int i=0; i<=3; i++)
		{
		System.out.println(Str1[i]);
		}

}
}
