package csjava;

class A11
{
	int a;
	void get_a()
	{
		a=10;
	}
	A11 copy(A11 m)
	{
		A11 x=new A11();
		x.a=m.a;
		return x;
	}
	void put_a()
	{
		System.out.println("a = "+a);
	}
}

public class objParam {

	public static void main(String[] args) 
	{
		A11 y=new A11();
		y.get_a();
		A11 y1=new A11();
		y1=y.copy(y);
		y1.put_a();

	}

}
