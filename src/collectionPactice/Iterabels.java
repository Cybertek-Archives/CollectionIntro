package collectionPactice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterabels {

	public static void main(String[] args) {
		
		// LAST WAY OF ITERATING OVER A COLLECTION 
		// BE ABLE TO REMOVE WHILE ITERATING OVER 
		
		List<Integer> lst = new ArrayList<>(); 
		lst.add(12) ;
		lst.add(15) ;
		lst.add(20) ;
		
		Iterator<Integer> myIterator = lst.iterator();
//		System.out.println( myIterator.next() );
//		System.out.println( myIterator.next() );
//		System.out.println( myIterator.next() );
		
		System.out.println(  myIterator.hasNext()  );
		
		while( myIterator.hasNext() ) {
			
			int target = myIterator.next() ; 
			if(target>16) {
				myIterator.remove();
			}
			
		}
		System.out.println(lst);
		
		
//		for (Iterator<Integer> myIter1 = lst.iterator(); myIter1.hasNext()==false;  ) {
//			System.out.println( myIter1.next() );
//		}
		
		ListIterator<Integer> lstIt = lst.listIterator();
		
		
		/*
		 * Create a linkedList of String 
		 * add 4 elements 
		 * iterate over using Iterator
		 * remove the element 
		 * if the elements contains letter A and Z 	
		 * 
		 * */
		
		
		
		
		
		

	}

}
