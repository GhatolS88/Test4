package Constructor;

public class Akshu
{
String  Studentname;
int X;
int Y;
int Rollno;
char grade;
Akshu()
{
	 X=12;
	 Y=40;
}
Akshu(int a,int b)
{
	X=a;
	Y=b;
}
Akshu(String Sname,int No,char Bloodgroup)
{
	 Studentname=Sname;
	 Rollno=No;
	 grade=Bloodgroup;	
	 System.out.println("Studentname:"+Studentname+"  "+" Rollno:"+  Rollno +"  "+" grade:"+  grade);
	}
public void addition()
{
	int SUM=X+Y;
	System.out.println(SUM);

}


public static void main(String[] args) 
{
	Akshu A1=new Akshu();
	A1.addition();
	Akshu A2=new Akshu(20,30);
	A2.addition();
	Akshu A5=new Akshu(60,90);
	A5.addition();
	Akshu A3=new Akshu("Sonali",70,'A');
	Akshu A4=new Akshu("Akshayini",89,'A');
	
	
}
}
	

