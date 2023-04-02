package Array;

import java.util.Arrays;

public class int6 
{
	public static void main(String[] args) 
	{
		//Array declaration
		int I1[]=new int[5];
		//array initialization
		
		I1[0]=100;
		I1[1]=200;
		I1[2]=500;
		I1[3]=400;
		I1[4]=2600;
		
		Arrays.sort(I1);
		
		//Usage
		// To get size of array
		System.out.println(I1.length);//5
		// To get last index of array
		System.out.println(I1.length-1);//4
		
		// For Ascending
		
		for(int i=0;  i<=I1.length-1; i++)   
		{
			System.out.println(I1[i]);
		}
		System.out.println("------------------------");
		
		//FOR DESENDING
		for(int a=I1.length-1; a>=0;  a--)
		{
			System.out.println(I1[a]);
		}
}
}
