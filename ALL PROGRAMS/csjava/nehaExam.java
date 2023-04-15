package csjava;
import java.util.*;

public class nehaExam {
	public static void main (String args[]) {
		int num,mull=1 ;
		System.out.println("Enter the no:-");
		Scanner AC = new Scanner (System.in);
		num = AC.nextInt();
		for (int i=1; i<=num; i++)
{
	mull = mull*i;

}
 System.out.println("The factorial of "+num+" is "+mull);
	}
}