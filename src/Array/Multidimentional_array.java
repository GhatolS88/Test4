package Array;

public class Multidimentional_array
{
public static void main(String[] args)
{
	     // 0   1   2
	// 0    10  20  30
	// 1    40  50  60
	
	// Array Declaration
	int M1[][]=new int[2][3];
	
	//Array Initialization
	M1[0][0]=10;
	M1[0][1]=20;
	M1[0][2]=30;
	M1[1][0]=40;
	M1[1][1]=50;
	M1[1][2]=60;
	
	//Usage
	System.out.println(M1[0][0]);
	System.out.println(M1[1][1]);
	System.out.println(M1[0][1]);
	System.out.println(M1[1][2]);
}
}
