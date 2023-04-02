package Array;

public class int5
{
public static void main(String[] args) 
{
	// array declaration and initialization
	int I1[]= {111,222,333};
	
	//Usage
	// To get size of array
		System.out.println(I1.length);
		// To get last index of array
		System.out.println(I1.length-1);
		
		// i=0   0<=3  
		//       1<=3     1;
		//       2<=3     2;
		//       3<=3     3
		//       4<=3
		
		for(int i=0;  i<=I1.length-1; i++)
		{
			System.out.println(I1[i]);
		}
	
}
}
