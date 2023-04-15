package csjava;

public class cmdArg1 {

	public static void main(String[] args)
	{
	
		int a,b,c;
		try
		{
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a+b;
		System.out.println("The result is "+c);
		}catch(Exception e) {}
	}

}
