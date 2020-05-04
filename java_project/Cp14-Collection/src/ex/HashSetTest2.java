package ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		//HashSet<String> set = new HashSet<>();
		//Set<String> set = new HashSet<>();
		
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("First");set.add("First");
		
		
		
		
		
		
		System.out.println(set.size());
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
