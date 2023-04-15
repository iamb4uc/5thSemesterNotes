package csjava;
import java.util.*;
public class stringTokenExam 
{
	public static void main(String[] args)
	{
		StringTokenizer st = new StringTokenizer("my,name+is,khan");  
        
	      // printing next token  
	      System.out.println("Next token is : " + st.nextToken("e"));  

	}

}
