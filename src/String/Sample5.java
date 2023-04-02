package String;

public class Sample5
{
public static void main(String[] args)
{
	String  S1="velocity";
	String  S2="";
	String  S3="ABCD";
	String  S4="VELOCITY";
	String  S5="City";
	String  S6="abcabab";
	String  S7="Classes";
	String  S8="Manual Classes";
	
	//To get Size/length/capacity
	System.out.println(S1.length());  //8
	
	//To Verify S1,S2  are empty or not
	System.out.println(S1.isEmpty() );  //false
	System.out.println(S2.isEmpty() );  //True
	
	//To convert to UpperCase
	System.out.println(S1.toUpperCase()); //VELOCITY
	
	//To convert to LowerCase
	System.out.println(S1.toLowerCase()); //velocity
	
	//To compare S1 and S4
	System.out.println(S1.equals(S4) ); //velocity    VELOCITY--->FALSE
	
	//To compare S1 and S4
		System.out.println(S1.equalsIgnoreCase(S4) ); //velocity   VELOCITY---->TRUE
		
    //To compare S1 and S5
		System.out.println(S1.contains(S5)); //false
		
	//To Get single character
		System.out.println(S1.charAt(0));//v
		
		//To verify that String S1 start with "ve";
		System.out.println(S1.startsWith("ve"));  //velocity ---true
		
		//To verify that String S1 end with "ty";
				System.out.println(S1.endsWith("ty")); //----true
				
				
	// To get the index of character
		System.out.println(S1.indexOf('c'));//4
				
	//To get the last of index of character
				System.out.println(S6.lastIndexOf('a'));//5	
	
				
	//To get substring
	 System.out.println(S1.substring(4)); //city
	 
	 //To get substring
	 System.out.println(S1.substring(4,7)); //velo  c(4)i(5)t(6)y(7)
	 
	 //To concat S1 and S7
	 System.out.println(S1.concat(S7)); //velocity classes
	  // OR
	//To concat S1 and S7
	 System.out.println(S1+S7); //velocity classes
	 
	 //To replace
	 System.out.println(S1.replace("Manual","Automation" )); //Automation classes
	 
	 
		
		
		
		
		
	
	
}
}
