package Casting;

public class Upcasting
{

public static void main(String[] args)
{
  Son S3=new Son();
    S3.Bike();
    S3.Home();
    S3.Car();
    S3.Money();
    System.out.println("------------------------");
    
    Father S2=new Son();
    S2.Car();
    S2.Home();
    S2.Money();
}
}
    

  