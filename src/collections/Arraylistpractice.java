package collections;

import java.util.ArrayList;

public class Arraylistpractice {

	public static void main(String[] args) {
		// implements List interface
		//ArrayList, Linked List, Vector
		//All 3 accepts duplicate data at new index
		//Array is fixed size but ArrayList is dynamic----can access and insert any values at any index
		// int[] array= new int[5];
		//elements storing order is sequential
		
		

		ArrayList<String> list = new ArrayList<String>();
		list.add("vedan");
		list.add("vikrant");
		System.out.println(list);
		//list.remove(1);
		
		System.out.println(list.get(1));
		System.out.println(list.contains("vedan"));
		System.out.println(list);
	}

}
