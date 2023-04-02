package Demo;

public class practo1
{
public static void main(String[]args)

{
	
	practo1 B2=new practo1();
	B2.Student1("Avinash",2034257867,45,21,'A');
	
	
}
	public void Student1(String StudentName,int StudentMobNo,int StudentRollNo,int StudentTeamNo,char Studentgrade) //Nonstatic method with parameter
	{
	System.out.println(StudentName);
	System.out.println(StudentMobNo);
	System.out.println(StudentRollNo);
	System.out.println(StudentTeamNo);
	System.out.println(Studentgrade);
}
}
