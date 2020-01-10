package JavaExceptions;

import java.util.Scanner;

public class ThrowKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the denominator");
		int denominator=sc.nextInt();
		try
		{
			if(denominator == 0)
			{
				throw new ArithmeticException();
			}
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("You Cannot divide by zero");
		}
		System.out.println("After Exception is caught");

	}

}
