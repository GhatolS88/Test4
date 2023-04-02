package Array;

public class Multidimentional2
{
public static void main(String[] args)
{
	//Array Declaration and Array Initialization
	
	int M1[][]= {{10,20,30},{40,50,60}};    //size=index+1
	//  0     1     2
//  0   10   20     30
//	1   40   50     60
	  // i=0;    0<=1  1
	 //          1<=1  2
	//           2<=1
	for(int i=0; i<=1; i++)
	{
	    	// a=0;   0<=2  1
		   //         1<=2  2
		   //         2<=2  3
		   //         3<=2
		for(int a=0; a<=2;  a++)
		{
			System.out.print(M1[i][a]+" ");
			
		}
		System.out.println();
	}
}
}
