package Interface;

import Generalization.Airtel;
import Generalization.IDEA;
import Generalization.JIO;

public class GenerClass
{
public static void main(String[] args)
{
	 Airtel A1=new Airtel();
	  A1.SMS();
	  A1.Calling();
	  A1.Data();
	 	 
	
	 System.out.println("------------------"); 
	 JIO J1=new JIO();
	 J1.SMS();
	 J1.Calling();
	 J1.Data();
	 
	 System.out.println("------------------");
	 IDEA I1=new IDEA();
	 I1.SMS();
	 I1.Calling();
	 I1.Data();
	 
}
}
