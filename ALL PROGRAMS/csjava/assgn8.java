package csjava;

public class assgn8 {

	public static void main(String[] args) 
	{
		char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		String s=new String(ch); 
		System.out.println("The string is " + s);
		System.out.println("The individual first character is " + ch[0]);
		String s1=new String("Kushal ");
		String s2=new String("Argha");
		s1.concat(s2);
		System.out.println("The string is " + s1.concat(s2));
		StringBuffer s3=new StringBuffer("Kushal ");
		StringBuffer s4=new StringBuffer("Argha");
		s3.append(s4);
		System.out.println("The string is " + s3);
		s3.insert(7,"Java ");
		System.out.println("The string is " + s3);
		s3.setLength(9);
		System.out.println("The string is " + s3);
		if(s1.equals(s2))
		{
			System.out.println("The strings are equal...");
		}
		else
		{
			System.out.println("The strings are not equal...");
		}
		s4.setCharAt(3, 'x');
		System.out.println("The updated string is " + s4);
	}

}
