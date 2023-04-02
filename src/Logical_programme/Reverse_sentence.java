package Logical_programme;

public class Reverse_sentence
{
	public static void main(String[] args)
		  {                    //0 //1 //2  //3
	            String  org="My  name is sonali";
	                                     //3     2   1  0
	         String   S1=ReverseSentence(org);    //sonali is name my
	        	
	        		 System.out.println(S1);
		
		  }
	
		
		public static String ReverseSentence(String Sentence)
		{
			
				
		String[]   text=Sentence.split("");
		
		String rev="";
		
		for(int i=text.length-1;  i>=0;  i--)  //sonali is name+my
		 {
			rev=rev+text[i]+"";
		 }
               return rev;
	   }
}

