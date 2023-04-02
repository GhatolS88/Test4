package Logical_programme;

import java.util.Scanner;

public class Scanner3 
{	
	//check the given no  even or odd from taking  user input
	public static void main(String[] args)
	{	
		
		Scanner scan=new Scanner(System.in);
				System.out.println("Enter No:");
				
			int 	Num=scan.nextInt();
			if(Num%2==0)
			{
				System.out.println("given no is even");
			}
			else
			{
				System.out.println("given no is odd");
			}
	}

}
