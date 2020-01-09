package BasicJavaPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateNumberOfCharacters {

	public static void main(String[] args) {
		String name="sudarshannnn";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		char[] c=name.toCharArray();
		int i=0;
		for(char c1:c)
		{
			
			
			if(map.containsKey(c1))
			{
				int value1=map.get(c1);
				value1++;
				map.put(c1, value1);
				
			}
			else
			{
				map.put(c1, 1);
			}
			
		}
		HashMap<Integer,Character> hmap=new HashMap<Integer,Character>();
		System.out.println(map);
		Set<Entry<Character,Integer>> mapEntry=map.entrySet();
		
		System.out.println(mapEntry);
		Iterator<Entry<Character,Integer>> itr=mapEntry.iterator();
		while(itr.hasNext())
		{
			Entry<Character,Integer> entryitr=itr.next();
			if(entryitr.getValue()>1);
			{
				System.out.println(entryitr.getKey());
			}
		}
		
		
	}

}
