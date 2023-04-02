package Demo;

public class dhiraj_Task1 
{
  String Sname;
  int RollNo;
  int Mark;
  
  dhiraj_Task1(String Studentname,int a,int b )
  {
	this. Sname=Studentname;
	this. RollNo=a;
	 this.Mark=b;
	 System.out.println("Sname:"+Sname);
	 System.out.println("RollNo:"+RollNo);
	 System.out.println("Mark:"+Mark);
  }
  public void m1()
  {
	  System.out.println("-----------------");
  }
  public static void main(String[] args)
  {
	dhiraj_Task1 T1=new dhiraj_Task1("Monika",24,98);
	
	dhiraj_Task1 T2=new dhiraj_Task1("Banti",25,80);
	
	dhiraj_Task1 T3=new dhiraj_Task1("Harish",26,81);
	
	dhiraj_Task1 T4=new dhiraj_Task1("Monali",29,87);
	dhiraj_Task1 T5=new dhiraj_Task1("Radha",37,77);
	
}
}
