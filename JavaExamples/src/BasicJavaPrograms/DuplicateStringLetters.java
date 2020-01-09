package BasicJavaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateStringLetters {

	private static int index;
	private static int multicharacterindex;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String data=sc.next();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[] letterarray=data.toCharArray();
		for(char letter:letterarray)
		{
			if(map.containsKey(letter))
			{
				index=map.get(letter);
				index++;
				map.put(letter, index);
			}
			else
			{
				map.put(letter, 1);
			}
		}
		
		System.out.println(map);
		
		ArrayList<Character> al=new ArrayList<Character>();
		Set<Character> keyset1=map.keySet();
		for(Character key:keyset1)
		{
			multicharacterindex=map.get(key);
			if(multicharacterindex>1)
			{
				al.add(key);
			}
			
		}
		
		System.out.println("Multiple Characters in the String are below");
		System.out.println(al);
	}

}
