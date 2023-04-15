package csjava;

//demonstration of multiple inheritance using interface
//In java we can't implement multiple inheritance directly 
//i.e. can't have multiple base classes

class A1 //1st super class
{
	void disp_A1()
	{
		System.out.println("Display A");
	}
}
interface B1  // 2nd super class i.e. in the form of interface
{
	void disp_B1(); //allowed only prototypes
}

class C1 extends A1 implements B1
{
	public void disp_B1() //method of interface B
	{
		System.out.println("Display interface B ");
	}
	void disp_C1()
	{
		System.out.println("Display C");
	}
	
}
public class multi_inter {

	public static void main(String[] args) 
	{
		C1 c=new C1();
		c.disp_A1();
		c.disp_B1();
		c.disp_C1();

	}

}
