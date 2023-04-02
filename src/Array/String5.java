package Array;

public class String5 
{
public static void main(String[] args) 
{
	// array declaration and initialization
	
	String Str1[]= {"viru","Vira","Virzara","Surya"};
	
	
	 // To get size of array
		System.out.println(Str1.length);   //size=index+1;
		//To get last index of array
		System.out.println(Str1.length-1);  //3-1=2;
		
		// i=0      0<=3    
		        //    1<=3    1
		        //    2<=3     2
		       //     3<=3     3
		//            4<=3  
		
		for(int i=0; i<=Str1.length-1;  i++)
		{
			System.out.println(Str1[i]);
		}
		


}
}
