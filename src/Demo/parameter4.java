package Demo;

public class parameter4
{
	public static void main(String[]args)
	{
		parameter4 v1=new parameter4();
		v1.m4("Akshayini",1);
		v1.m4("Aaradhya", 2);
		
		parameter3 v2=new parameter3();
		v2.m3();
		v2.m5("Rajesh",45,67.5f);
		
		Parameter2.m1();
		Parameter2 v3=new Parameter2();
		v3.m2("Swati", 23);
		
		
	}
		public void m4(String BabyName,int BabyAge)  //with parameter
	{
		System.out.println(BabyName);
		System.out.println(BabyAge);

    }
}