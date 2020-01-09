package BasicJavaPrograms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to reverse");
		String s1=sc.nextLine();
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
		}
		
		System.out.println("Reverse String is: "+reverse);
		
		if( s1.equals(reverse))
		{
			System.out.println("Both the Strings are palindrome");
		}
		else
		{
			System.out.println("Both the Strings are not palindrome");
		}

	}

}
