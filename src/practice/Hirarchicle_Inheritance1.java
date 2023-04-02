package practice;

public class Hirarchicle_Inheritance1 extends plants_Inheritance

{
         public static void main(String[]args)
      {
	flower_plants F1=new flower_plants();
	F1.Gulab_plants();
	F1.Type_of_plants();
	
	Fruit_plants F2=new Fruit_plants();
	F2.Mango_plants();
	F2.Type_of_plants();
	
	onlyLeap_plants O1=new onlyLeap_plants();

	O1.smallleap_plants();
	O1.Type_of_plants();
	
      }
}
