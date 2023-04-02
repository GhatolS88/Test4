package Interface;

public class Testing  implements Interface9,Interface10
{
//m7();
//m7();
	public void m7()
	{
	System.out.println("Attitude,confidence,Trust");
		   Interface9.super.m7();
		 Interface10.super.m7();
   }
	public static void main(String[] args)
	{
		Testing T1=new Testing();
		       T1.m7();
	}
}

  