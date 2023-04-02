package practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector
{	
	  public static void main(String[]args)
	  {

	// create object of vector 

	Vector  V1=new  Vector();

	//add info

	V1.add("Sona");
	V1.add(100);
	V1.add(12.45f);
	V1.add('S');
	V1.add(null);

	//to get size
	System.out.println(V1.size());
	//find object is empty
	System.out.println(V1.isEmpty());
	//if containt present or not
	System.out.println('S');
	//add info into exting info
	V1.add(1,400);
	System.out.println(V1);
	//remove info
	V1.remove(1);
	System.out.println(V1);
	//update info
	V1.set(3,'D');
	System.out.println(V1);
	//get index
	System.out.println(V1.indexOf("Sona"));
	//to info by providing index
	System.out.println(V1.get(0));

	System.out.println("--------for each loop-------");
	for(Object S1:V1)
	{
	   System.out.println(S1);
	}
	System.out.println("-----------Iterator cursor------------");

	Iterator  itr=V1.iterator();
	while(itr.hasNext())
	{
	  System.out.println(itr.next());
	}
	System.out.println("------------listietrator--------");
	ListIterator  List=V1.listIterator();
	while(List.hasNext())
	{
		System.out.println(List.next());
	}

	System.out.println("----Enumeration cursor---");

	Enumeration  E1=V1.elements();
	 while(E1.hasMoreElements())
	{
	  System.out.println(E1.nextElement());
	}
	}
	}

