package csjava;

class runnable1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread has ended");
	}
}

public class runnable_impl {

	public static void main(String[] args)
	{
		runnable1 r=new runnable1();
		Thread t=new Thread(r);
		t.start();
		System.out.println("Hi");
	}

}
