package csjava;
import java.util.*;

class factorial
{
	int facto(int n)
	{
		int f=1;
		int i;
		for(i=1;i<=n;i++)
			f=f*i;
		return f;
	}
}





public class fact {

	public static void main(String[] args) 
	{
		factorial F;
		F=new factorial();
		System.out.println("Enter the value for n :");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println("The factorial is " + F.facto(n));
	}

}
