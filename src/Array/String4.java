package Array;

public class String4 
{
	public static void main(String[] args)
	{
		// Array Declaration
		String Str1[]=new String[3];
		
		// array initialization
		Str1[0]="Viru";
		Str1[1]="Vira";
		Str1[2]="Virzara";
	
	
	//Usage
	
 // to get size of array
	System.out.println(Str1.length);   //size=index+1;
	//To get last index of array
	System.out.println(Str1.length-1);  //3-1=2;
	
	// i=0      0<=2    
	        //    1<=2     1
	        //    2<=2     2
	       //     3<=2
	
	for(int i=0; i<=Str1.length-1;  i++)
	{
		System.out.println(Str1[i]);
	}
	

}
}
