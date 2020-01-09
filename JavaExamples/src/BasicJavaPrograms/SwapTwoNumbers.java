package BasicJavaPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("To Swap Two Numbers");
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		System.out.println("Numbers before swapping is:"+a+"and"+b);
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println("Numbers after swapping is:"+a+"and"+b);
	}
	
		

}
