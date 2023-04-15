package csjava;
import java.io.*;
public class AddFst1 {

	public static void main(String[] args) 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		//int a,b,c;
		float a,b,c;
		try
		{
			System.out.println("Enter 1st number..");
			a=Float.valueOf(in.readLine());
			System.out.println("Enter 2nd number..");
			b=Float.valueOf(in.readLine());
			c=a+b;
			System.out.println("The result is "+c);
		}
		catch(Exception e) 
		{
			System.out.println("Invalid Input...");
		}
		
		

	}

}
