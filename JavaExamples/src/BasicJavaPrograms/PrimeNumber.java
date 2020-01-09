package BasicJavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number to check whether the number is prime or not");
		int number=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<number/2;i++)
		{
			if (number % i == 0)
			{
				flag=false;
				break;
			}

		}
		
		if (flag == false)
		{
			System.out.println("Number is not a prime number");
		}
		else
		{
			System.out.println("Number is a prime number");
		}

	}

}
