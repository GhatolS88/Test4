package Demo;

public class Subject 
{
	public static void main(String[]args)
	{
		// for static method
Subject1.Math();
Subject3.Marathi();
Subject3.Hindi();
Subject3.English();

//Non-static regular method
// Create object
Subject2 Education1=new Subject2();   //Classname Objectname=new Classname();
//call method
Education1.Science();                 //Objectname.methodname();

Subject3 Education2=new Subject3();   //Classname Objectname=new Classname();
//call method
Education2.History();                 //Objectname.methodname();
Education2.Geography();               //Objectname.methodname();
Education2.Economic();                //Objectname.methodname();


}
}
