package JavaExceptions;

import java.util.Scanner;

public class FinallyKeyWordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numerator");
		int numerator=sc.nextInt();
		System.out.println("Enter the denominator");
		int denominator=sc.nextInt();
		
		try
		{
			System.out.println(numerator/denominator);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithematic Exception is Caught");
		}
		finally
		{
			System.out.println("This Block always get executed");
		}
	}

}
