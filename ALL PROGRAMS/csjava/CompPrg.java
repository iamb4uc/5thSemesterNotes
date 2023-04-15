package csjava;

//program to demonstrate passing objects as arguments

class complex
{
	int real;
	int imag;
	complex(int m,int n)//parametrized constructor
	{
		real=m;
		imag=n;
	}
	void add(complex c1,complex c2)//function with object as argument
	{
		complex c=new complex(0,0);
		c.real=c1.real+c2.real;
		c.imag=c1.imag+c2.imag;
		System.out.println("Real= "+c.real+"Imaginary= "+c.imag);
	}
}


public class CompPrg {

	public static void main(String[] args) 
	{
		complex C1,C2,C3;
		C1=new complex(12,23);//initialise the object C1
		C2=new complex(45,56);//initialise the object C2
		C3=new complex(0,0);//initialise the object C3
		C3.add(C1, C2); //calling method with object as arguments
	}

}
