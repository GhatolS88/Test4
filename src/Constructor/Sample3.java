package Constructor;

public class Sample3
{
	// Step-I:variable declaration
    int U;  //non-static global variable;
    int V;   //non-static global variable;
    
    //Step-II:variable initialization
    
    Sample3()   //user defined without parameter constructor;
    {
 	   U=10;
 	   V=6;
    }
    Sample3(int f,int h)  //user defined withparameter constructor
    {
 	   U=f;
 	   V=h;
    }
   
//Step-III:Usage
    public void addition()
    {
 	  int  SUM=U+V;
 	   System.out.println(SUM);
    }
    public static void main(String[]args)
    {
 	   withparameter w1=new withparameter();
 			   w1.addition();
 	   
 	   withparameter w2=new withparameter(24,56);
 	   w2.addition();
    }

}
