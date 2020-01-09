package BasicJavaPrograms;

import java.util.Scanner;

public class StrintReverseUsingBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string to reverse");
		String data1=sc.next();
		StringBuilder stringreverse=new StringBuilder();
		stringreverse.append(data1);
		System.out.println("Reversed String is below");
		System.out.println(stringreverse.reverse());
		
		
	}

}
