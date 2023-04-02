package Demo;

public class City
{
public static void main(String[]args)
{
	//Step->|:Create object
	City1 D1=new City1();
	
	City2 D2=new City2();
	//Step->||:Call Method
	City1.Nagpur();      //classname.methodname();
	City1.Wardha();      //classname.methodname();
	D1.Amravati();       //objectname.methodname();
	
	City2.Mumbai();        //classname.methodname();
	D2.Akola();           //objectname.methodname();
	D2.Jalgaon();          //objectname.methodname();
}
}
