package Logical_programme;

import java.util.Scanner;

public class Scanner1
{	
	//Addition of 2 no by taking input from user
	public static void main(String[] args)
	{	
		Scanner scan=new  Scanner(System.in);
		
		System.out.println("EnterNo 1:"); 
		int  Num1=scan.nextInt();  //45
		
		System.out.println("EnterNo 2:");
		int  Num2=scan.nextInt();//34
		
		System.out.println(Num1+Num2);//79
		
		
	}

}
