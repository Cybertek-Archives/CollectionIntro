package collectionPactice;

import java.util.*;

public class SetPractice {

	public static void main(String[] args) {
		
		Set<Integer> numSet = new HashSet<>(); 
		numSet.add(12) ; 
		numSet.add(20) ; 
		numSet.add(14) ; 
		numSet.add(12) ; 
		numSet.add(12) ; 
		
		System.out.println( numSet );
	
		for (Integer each : numSet) {
			System.out.println(each);
		}
		
		// TASK 1 : --> USE ITERATOR TO ITERATE OVER ABOVE SET 
		Iterator<Integer> iterator = numSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(numSet.toString());
    }

	}

}
