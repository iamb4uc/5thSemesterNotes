package csjava;

class Vehicle
{  
	  void run()
	  {
		  System.out.println("Vehicle is running");
	  }  
}  

class Bike extends Vehicle
{  
	  //defining the same method as in the parent class  
	  void run()
	  {
		  System.out.println("Bike is running safely");
	  }  
}

public class override extends Vehicle
    {

	public static void main(String[] args) 
	{
		//Vehicle V=new Vehicle();
		Bike obj = new Bike();  
		  //calling the method with child class instance  
		  obj.run();  
		  //V.run();

	}

}
