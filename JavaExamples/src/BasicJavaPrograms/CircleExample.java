package BasicJavaPrograms;

import java.math.*;
import java.util.Scanner;

public class CircleExample {
	
	public static int radius;
	
	public CircleExample()
	{
		System.out.println("Enter the value for the radius");
		Scanner sc=new Scanner(System.in);
		radius=sc.nextInt();
		
	}
	
	public static double perimeter()
	{
		double perimeter_value=2*Math.PI*radius;
		return perimeter_value;
	}
	
	public static double area()
	{
		double area_value=Math.PI*Math.pow(radius, 2);
		return area_value;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircleExample ce=new CircleExample();
		System.out.println("The perimeter of the circle : "+ce.perimeter());
		System.out.println("The area of the circle :"+ce.area());
		
	}

}

