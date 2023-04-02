package String;

public class Sample6
{
public static void main(String[] args) 
{
	// string is immutable in nature
	// without using new keyword
	String S1="Pune";
	String S2="Pune";
	String S3="Pune";
	String S4="Pune";
	String S5="Pune city";   //Mumbai
	
	System.out.println(S5.replace("Pune","Mumbai"));
	System.out.println(S1+"  "+S2+"  "+S3+"  "+S4+"  "+S5.replace("Pune", "Mumbai"));
	 
} 
}
