package BasicJavaPrograms;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		int remainder=0;
		int quotient;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		try
		{
			 number=sc.nextInt();
		}
		catch(Exception ex)
		{
			System.out.println("Input must be number");
		}
		
		String reverse="";
		while(number>0)
		{
			remainder=number%10;
			reverse=reverse+String.valueOf(remainder);
			number=number/10;
			
			
		}
		System.out.println("The reversed number is:"+Integer.parseInt(reverse));
		
		
		
	}

}
