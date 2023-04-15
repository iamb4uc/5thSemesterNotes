package csjava;
import java.util.*;
public class decToBin {

	public static void main(String[] args) {
		int []a;
		int r;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value for n");
		int n=in.nextInt();
		
		a=new int[10];
		int i=0;
		while(n>0)
		{
			r=n%2;
			a[i++]=r;
			n=n/2;
		}
		
		for(int j=i-1;j>=0;j--)
			System.out.print(a[j]);

	}

}
