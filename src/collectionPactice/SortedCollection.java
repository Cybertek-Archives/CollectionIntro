package collectionPactice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedCollection {

	public static void main(String[] args) {

		// Collections --->> A CLASS , Has a lot of utility methods

		List<Integer> lst = new ArrayList<>();
		lst.add(12);
		lst.add(15);
		lst.add(20);
		lst.add(2);
		lst.add(2);
		lst.add(2);
		lst.add(-20);

		System.out.println(lst);

		Collections.sort(lst);
		int numberOf2 = Collections.frequency(lst, 2);
		System.out.println(numberOf2);

		System.out.println(lst);

	}

}
