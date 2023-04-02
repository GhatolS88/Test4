package Array;

public class int3 
{
	public static void main(String[] args)
	{
		// Array Declaration
		int I1[]=new  int[3];
		
		//Array initialization
		
		I1[0]=143;
		I1[1]=342;
		I1[2]=235;
		
		// Usage
		//To get the size of array
		System.out.println(I1.length);    //size=3
		// To get last index of array
		System.out.println(I1.length-1);  //2
		
		for(int i=0;  i<=2;  i++)
		{
			System.out.println(I1[i]);
		}
	}

}
