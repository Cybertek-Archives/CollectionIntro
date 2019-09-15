package collectionpracticeDay2;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {

		List<String> lst = new ArrayList<>();
		lst.add("A");
		lst.add("A");
		lst.add("z");
		lst.add("b");
		lst.add("B");
		lst.add(" ");
		lst.add("9");

		// System.out.println( lst.subList(2, 5) );

		// System.out.println( lst );

//		Set<String> set = new HashSet<>( lst  );
//		System.out.println( set );

		// Set<String> sSet = new TreeSet<>( lst ) ;
		SortedSet<String> sSet = new TreeSet<>(lst);
		System.out.println(sSet);

		System.out.println(sSet.subSet("9", "z"));

		// System.out.println(sSet);

		// System.out.println( set.size() );

//		for (int i = 0; i < lst.size(); i++) {
//			set.add(  lst.get(i)   ) ; 
//		}
//		
//		System.out.println(  set.size()  );

//		set.addAll(lst);
		// System.out.println( set.size() );

		// List<String> lst2 = new ArrayList<>( lst );
		// System.out.println( lst2);

	}

}
