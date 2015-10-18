
public class logicCounter {
	
	public void counter (String str){

	String str1 = str;

	boolean space= true;
	int i;
	for ( i = 0; i < str1.length(); i++) 
	{
	
		if (str1.charAt(i) == ' ') {
	        space=true;
	    }
	else{
	      i++;
	    }
		
	}
	  System.out.println("there are "+ i+" letters" );
	}
	
	
	
	
	
}
