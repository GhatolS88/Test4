package Logical_programme;

import java.util.HashMap;
import java.util.Set;

public class Character_using_Hashmap 
{	
	public static void main(String[] args)
	{	
		String  org="abcbcabd";  //a=?,b=?, c=?,d=?
		
		HashMap<Character,Integer>  mp=new   HashMap<Character,Integer>();
		
		for(int i=0; i<=org.length()-1; i++)
		{
			char  charvalue=org.charAt(i);  //d
			
			if(mp.containsKey(charvalue))
			{
				mp.put(charvalue,mp.get(charvalue)+1);
			}
			else
			{
				mp.put(charvalue,1);
			}
		}
		
		Set<Character>keys=mp.keySet();
		
		for(Character key:keys)
		{
			System.out.println(key+":"+mp.get(key));
		}
		
	}

}
