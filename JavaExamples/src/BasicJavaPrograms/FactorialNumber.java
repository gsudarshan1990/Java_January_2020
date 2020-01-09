package BasicJavaPrograms;

import java.util.Scanner;

public class FactorialNumber {
	
	public static int fact(int number)
	{
		if ( number == 0)
		{
			return 1;
		}
		else
		{
			return number*fact(number-1);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the factorial of that number");
		int number=sc.nextInt();
		int factorial=fact(number);
		System.out.println("The factorial of a number is:"+factorial);
		
		
	}


}
