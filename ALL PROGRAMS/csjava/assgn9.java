package csjava;
import java.util.*;
class distance
{
	int feet,inches;
	void get_distance(int f,int i) {
		this.feet=f;
		this.inches=i;
	}
	void show_distance()
	{
		System.out.println("feet is :-"+this.feet);
		System.out.println("inches is :-"+this.inches);
	}
}

public class assgn9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter feet :-");
		int f1= sc.nextInt();
		System.out.println("Enter inches :-");
		int i1= sc.nextInt();
		distance A= new distance();
		A.get_distance(f1, i1);
		A.show_distance();
	}

}
