package Constructor;

public class withparameter
{
// Step-I:variable declaration
       int X;  //non-static global variable;
       int Y;   //non-static global variable;
       
       //Step-II:variable initialization
       
       withparameter()    //user defined without parameter constructor;
       {
    	   X=12;
    	   Y=10;
       }
       withparameter(int f,int h)  //user defined withparameter constructor
       {
    	   X=f;
    	   Y=h;
       }
      
// Step-III:Usage
       public void addition()
       {
    	  int  SUM=X+Y;
    	   System.out.println(SUM);
       }
       public static void main(String[]args)
       {
    	   withparameter w1=new withparameter();
    			   w1.addition();
    	   
    	   withparameter w2=new withparameter(34,45);
    	   w2.addition();
       }
}
