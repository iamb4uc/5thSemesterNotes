package csjava;

public class demoException {
	public static void main(String[] args) 
	{
		 
			   try
			   {  
			      //code that may raise exception  
			      int data=100/0;  //example of divide by zero error
			      String s=null;  
			      int len = s.length();//NullPointerException
			      String s1="abc";  
			      int i=Integer.parseInt(s1);//NumberFormatException
			      System.out.println(i);
			   }catch(ArithmeticException e)
			   {
				   System.out.println("Divide by zero error");
			   }  
			   
			   
			  }  
			

	}

