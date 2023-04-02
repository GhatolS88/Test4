package Control_Satement;

public class nestedif
{
	public static void main(String[]args)
	

{
 String UN="abc";
		 
 String Password="xyz";            
 // abc1==abc  ----------------->false
 if("abc1"==UN)
 {
	 System.out.println("Corrrect UN");
 
//xyz1==xyz----------->false
	 
		 if("xyz"==Password)
		 {
			 System.out.println("correct Password-----Logine successfuly");
			 
		 }
		 else
		 {
			 System.out.println("Wtong Password--------Logine failed");
		 }
	 }
 else 
 {
	 System.out.println("Wrong UN----------->Logine failed");
 }
}
}