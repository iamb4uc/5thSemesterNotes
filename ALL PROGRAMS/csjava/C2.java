package csjava;


class A2 //1st super class
{
	public void disp_A2()
	{
		System.out.println("Display A");
	}
}
interface B2  // 2nd super class i.e. in the form of interface
{
	void disp_B2(); //allowed only prototypes
}

public class C2 extends A2 implements B2
{
	public void disp_B2() //method of interface B
	{
		System.out.println("Display interface B ");
	}
	public void disp_C2()
	{
		System.out.println("Display C");
	}
	
}

