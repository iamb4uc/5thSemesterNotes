package bcsjava3rd2021;

import java.io.*;
//import java.util.*;
public class op1 {

	public static void main(String[] args) {
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));	
	//Scanner in = new Scanner(System.in);
    try
    {
    	int a,b,c;
    	//float a,b,c;
    	System.out.println("Enter the first value");
    	//a=Float.valueOf(in.readLine()).floatValue();
    	a=Integer.parseInt(in.readLine());
    	//a=in.nextInt();
    	//a=in.nextFloat();
    	System.out.println("Enter the second value");
    	//b=Float.valueOf(in.readLine()).floatValue();
    	b=Integer.parseInt(in.readLine());
    	//b=in.nextInt();
    	//b=in.nextFloat();
    	c=a+b;
    	System.out.println("The result is "+c);
    }
    catch(Exception e) {System.out.println("Input error");}
   	}
}
