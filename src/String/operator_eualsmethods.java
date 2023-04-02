package String;

public class operator_eualsmethods 
{
public static void main(String[] args)
{
	//without using new keyword
	
	String S1="XYZ";
	String S2="XYZ";
	String S3="pqr";
	
	System.out.println(S1==S2);   //true
	System.out.println(S1.equals(S2)); //true //XYZ  XYZ  ----->
	System.out.println(S1==S3);//false
	
	//with using new keyword
	
	String S4=new String("abc");
	String S5=new String("abc");
	
	
	System.out.println(S4==S5); //false
	System.out.println(S4.equals(S5));//true   //abc  abc----------
	
}
}
