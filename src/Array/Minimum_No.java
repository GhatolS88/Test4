package Array;

import java.util.Arrays;

public class Minimum_No
{	
	public static void main(String[] args)
	{	
		int array[]= {10,20,30,4,5,6};
		int Size=array.length;
		Arrays.sort(array);
		System.out.println("sorted Array::"+Arrays.toString(array));
		int res=array[0];
		System.out.println("Minimum No is:"+res);
		
	}

}
