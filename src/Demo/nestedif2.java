package Demo;

public class nestedif2
{
public static void main(String[] args)
{
	String lightstatus1="ON";
	String lightstatus2="OFF";
	
	if("ON"==lightstatus1)
	{
		System.out.println("Freez condition good");
	if("OFF"==lightstatus2)
	{
		System.out.println("Freez  work properly");
		
	}
	else
	{
		System.out.println("Freez work in few days only");
	}
	}
	else
	{
		System.out.println("freez is in bad condition");
	}
}
}
