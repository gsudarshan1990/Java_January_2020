package BasicJavaPrograms;

import java.util.ArrayList;

public class ForEachLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(Integer num:al)
		{
			System.out.println(num);
		}
		
	}

}
