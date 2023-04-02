package Array;

public class int4 
{
public static void main(String[] args)
{
	//Array declration
	int I1[]=new int[3];
	//array initialization
	
	I1[0]=100;
	I1[1]=200;
	I1[2]=500;
	//Usage
	// To get size of array
	System.out.println(I1.length);
	// To get last index of array
	System.out.println(I1.length-1);
	
	for(int i=0;  i<=I1.length-1; i++)
	{
		System.out.println(I1[i]);
	}
}
}
