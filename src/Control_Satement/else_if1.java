package Control_Satement;

public class else_if1 
{
public static void main(String[] args)
{
int Train_Faire=3000;
	
	if(Train_Faire>=5000)
	{
		System.out.println("Reservation Class");
	}
	else if(Train_Faire>=4000)
	{
		System.out.println("Ac Class");
	}
	else if(Train_Faire>=3500)
	{
		System.out.println("Reservation for 1st Ac Class");
	}

	else if(Train_Faire>=2000)
	{
		System.out.println("Reservation for 2nd AC Class");
	}

	else if(Train_Faire>=1500)
	{
		System.out.println("Reservation for 3tire Ac Class");
	}

	else
	{
		System.out.println("General Class");
	}
}
}

