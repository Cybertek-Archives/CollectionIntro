package collectionPactice;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {

		SortedSet<Integer> numSet = new TreeSet<>();
		numSet.add(12);
		numSet.add(20);
		numSet.add(14);
		numSet.add(100);
		numSet.add(-19);
		numSet.add(122);
		numSet.add(12);

		System.out.println(numSet);

		/*
		 * Create a String of TreeSet and add 6 items with duplicate try to iterate over
		 * using for loop and iterator
		 * 
		 */

//		for (Integer each : numSet) {
//			System.out.println(each);
//		}

		SortedSet<String> mySet = new TreeSet<>();
		mySet.add("Ali");
		mySet.add("ali");
		mySet.add("Aysegul");
		mySet.add("     Ramazan");
		mySet.add("Khazar");
		mySet.add("Guler");
		mySet.add("guler");

		System.out.println(mySet);
		SortedSet<String> tail = mySet.tailSet("Aysegul");
		System.out.println(tail);
		SortedSet<String> head = mySet.headSet("Aysegul");
		System.out.println(head);

		Iterator<String> myIterator = mySet.iterator();

		while (myIterator.hasNext()) {

			// System.out.print (myIterator.next() + " ");
		}

	}

}
