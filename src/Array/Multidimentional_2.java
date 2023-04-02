package Array;

public class Multidimentional_2
{
public static void main(String[] args)
{
	// Array declaration
	int M1[][]=new  int[2][3];
	
	// Array Initialization
	M1[0][0]=10;
	M1[0][1]=20;
	M1[0][2]=30;
	M1[1][0]=40;
	M1[1][1]=50;
	M1[1][2]=60;
	
	// Usage
	// outer for loop for "Row"
	for(int i=0;  i<=1;  i++)
	{
		for(int a=0; a<=2; a++)
		{
			System.out.print(M1[i][a]+" ");
		}
		System.out.println();
	}
	
}
}
