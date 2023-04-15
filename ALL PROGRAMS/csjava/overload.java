package csjava;

class Adder
 {  
 int add(int a,int b)

 	{
	return a+b;
 	}  
 
 int add(int a,int b,int c)
 {
	 return a+b+c;
 }  
 }  

public class overload {

	public static void main(String[] args) 
	{
		Adder A=new Adder();
		System.out.println(A.add(11,11));  
		System.out.println(A.add(22,33,44));

	}

}
