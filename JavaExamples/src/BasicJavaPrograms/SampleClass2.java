package BasicJavaPrograms;

import java.util.Scanner;

public class SampleClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Character as String");
//		String ch=sc.next();
//		System.out.print("Below we convert from String to Character");
//		char character=ch.charAt(0);
//		System.out.println("The character is: "+character);
		int[] j=new int[4];
		for(int i=0;i<j.length;i++)
		{
			System.out.println(j[i]);
		}
		String s="Dinesh";
		char[] c=new char[5];
		System.out.println(s.length()+"***"+c.length);
		//s.getChars(0, s.length(), c, 0);
		for(int i=0;i<=c.length;i++)
		{
			System.out.println(c[i]);
		}
		
//		char c='a';
//		Character character1=new Character(c);

	}

}
