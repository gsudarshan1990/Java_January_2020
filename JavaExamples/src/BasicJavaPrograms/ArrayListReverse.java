package BasicJavaPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		Collections.reverse(al);
		System.out.println("The Reverse list as below:"+al);
		
		
	}

}
