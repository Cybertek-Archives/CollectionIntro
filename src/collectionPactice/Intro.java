package collectionPactice;

import java.util.*;

public class Intro {

	public static void main(String[] args) {

		// What did we learn so far

		// Array -- []

		/*
		 * Size : once set can not be modified add or delete items after object is
		 * create print directly
		 */

		int[] arr = { 1, 2, 3 };
		System.out.println(arr);

		/*
		 * we need to be able to resize the data structure add or delete items store
		 * only unique elements first in first out or first in last out --
		 * 
		 * <USA , 28> <UK , 20>
		 * 
		 */

		// TASK 1 :
		/*
		 * Create an Arraylist of String add 5 items , iterate over it.
		 * 
		 * Use Collection interface as reference type
		 * 
		 */
		// ONLY REFERENCE TYPE DECIDE WHAT WE CAN ACCESS
		// Collection<String> col = new ArrayList <>();

		List<String> col = new ArrayList<>();

		col.add("apple");
		col.add("banana");
		col.add("orange");
		col.add("carrot");
		col.add("Kiwi");
		col.add("aaa");

		for (String each : col) {
			System.out.println(each);
		}

		col = new LinkedList<>();
		col.add("heydar");
		col.add("John");
		col.add("Serik");

		// col.remove("John");

		System.out.println(col.get(1));
		System.out.println();

		// System.out.println(col);

	}

}
