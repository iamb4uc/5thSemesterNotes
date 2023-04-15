package csjava;
//demonstration of multilevel inheritance
class A //super class
{
	void disp_A()
	{
		System.out.println("Display A");
	}
}

class B extends A //Intermediate base class
{
	void disp_B()
	{
		System.out.println("Display B");
	}
}

class C extends B //child class
{
	void disp_C()
	{
		System.out.println("Display C");
	}
}


public class multilvl {

	public static void main(String[] args) 
	{
		C c=new C();
		c.disp_A();
		c.disp_B();
		c.disp_C();

	}

}
