package Array;

public class int2
{
	public static void main(String[] args)
	{
		//Array Declaration
		int I1[]=new int[3];
		
		// Array initialization
		I1[0]=111;
		I1[1]=122;
		I1[2]=133;
		
		// Usage
		        // i=0   0<=2      1
		        //       1<=2      2
		        //       2<=2      3
		        //       3<=2
		
		               
		for(int i=0; i<=2; i++)  // for the last index
		{
			System.out.println(I1[i]);
		}
	}

}
