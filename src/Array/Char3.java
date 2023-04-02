package Array;

public class Char3
{
	public static void main(String[] args)
	{
		//array declaration
		      char  C1[]=new char[3];
		      
		      
		      //array Initialization
		       C1[0]='A';
		       C1[1]='B';
		       C1[2]='C';
		       
		       
		       // Usage
		       // To get last size of array
		       System.out.println(C1.length);  //3
		       // To get last index of array
		       System.out.println(C1.length-1);  //3-1=2
	
		       for(int i=0; i<=C1.length-1; i++)
		       System.out.println(C1[i]);
		       
		       
	}

}
