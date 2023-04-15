package csjava;
import java.util.*;

public class AddFst {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		//int a,b,c;
		float a,b,c;
		try
		{
			System.out.println("Enter first number");
			a=in.nextFloat();
			System.out.println("Enter second number");
			b=in.nextFloat();
			c=a+b;
			System.out.println("The result is "+c);
		} catch(Exception e) {}
		

	}

}
