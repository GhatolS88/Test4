package practice;

public class pyramid
{
public static void main(String[] args)
{
 for (int i=5; i>=1; i=i-1)
 {
	 for(int j=5; j>=i; j=j-1)
	 {
		 System.out.print(" "); 
	 }
	 for(int k=1; k<=i; k=k+1)
	 {
		 System.out.print(i); 
	 }
	 
	 System.out.println(); 
 }
 
} 
}
