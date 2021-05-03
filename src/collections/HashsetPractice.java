package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetPractice {

	public static void main(String[] args) {
		// HashSet,Treeset,Linkedset
		// Does not store duplicate elements
		//elements are not stored in sequential index order
		
		HashSet<String> set= new HashSet<String>();
		
		set.add("Vedan");
		set.add("India");
		set.add("US");
		set.add("India");
		set.add("ABC");
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.contains("ind"));
		
		Iterator<String> it= set.iterator();
		
		  System.out.println(it.next()); 
		  System.out.println(it.next());
		 
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}

}
