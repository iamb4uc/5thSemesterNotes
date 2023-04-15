package csjava;

class tA extends Thread
{
	public void run()
    {
		for(int i=1;i<=5;i++)
			System.out.println("i = "+i);
    }
}

class tB extends Thread
{
	public void run()
    {
		for(int j=1;j<=5;j++)
			System.out.println("j = "+j);
    }
}

class tC extends Thread
{
	public void run()
    {
		for(int k=1;k<=5;k++)
			System.out.println("k = "+k);
    }
}


public class threadExamp {

	public static void main(String[] args) 
	{
		tA A=new tA();
		tB B=new tB();
		tC C=new tC();
		A.start();
		B.start();
		C.start();

	}

}
