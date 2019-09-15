package collectionPactice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SublistPractice {

	public static void main(String[] args) {

		// List<Integer> lst2 = Arrays.asList(1,4,6,7,8,9,90,10,20,30) ;
//		List<Integer> lst2 = new ArrayList<>();
//		lst2.add(22);
//		lst2.add(32);
//		lst2.add(12);
//		lst2.add(123);
//		lst2.add(11232);
//		lst2.add(222);
//		lst2.add(334);
//		lst2.add(555);
//		lst2.add(666);
//		
//		System.out.println(lst2);
//		
//		List<Integer> sub = lst2.subList(1, 5) ; 
//		System.out.println(sub);
//		sub.set(2, 1000000000) ; 
//	
//		System.out.println(sub);
//		System.out.println(lst2);

		/*
		 * Create list of String that have 7 elements
		 * 
		 * Change the items from index 2-5 -->> I love Collection You are required to
		 * use Sublist
		 * 
		 * then print it out try to delete one item from sub list and see whether it
		 * affect orgiginal list
		 * 
		 */

//		lst2.remove(2) ; 
//		System.out.println(lst2);
		List<String> list2 = new ArrayList<>();
		list2.add("SULEYMAN");
		list2.add("MEVLANA");
		list2.add("TURKAN");
		list2.add("ALI");
		list2.add("ALP");
		list2.add("AKIN");
		list2.add("DURDANE");
		System.out.println(list2);

		List<String> sub2 = list2.subList(2, 6);
		Collections.sort(sub2);
		System.out.println(sub2);
		System.out.println(list2);

		for (int i = 0; i < sub2.size(); i++) {
			sub2.set(i, "I LOVE COLLECTION");
		}
		System.out.println(list2);

		sub2.remove(2);
		System.out.println(list2);

	}

}
