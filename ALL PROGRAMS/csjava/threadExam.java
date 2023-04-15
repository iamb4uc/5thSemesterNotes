package csjava;

class tA1 implements Runnable
{
	public void run()
    {
		for(int i=1;i<=5;i++)
			System.out.println("i = "+i);
    }
}

class tB1 implements Runnable
{
	public void run()
    {
		for(int j=1;j<=5;j++)
			System.out.println("j = "+j);
    }
}

class tC1 implements Runnable
{
	public void run()
    {
		for(int k=1;k<=5;k++)
			System.out.println("k = "+k);
    }
}


public class threadExam {

	public static void main(String[] args) 
	{
		
		tA1 A=new tA1();
		tB1 B=new tB1();
		tC1 C=new tC1();
		Thread t1=new Thread(A);
		Thread t2=new Thread(B);
		Thread t3=new Thread(C);
		t1.start();
		t2.start();
		t3.start();

	}

}
