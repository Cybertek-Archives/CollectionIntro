package collectionPactice;

import java.util.LinkedList;
import java.util.List;

public class Practice {

	public static void main(String[] args) {

		List<String> lst = new LinkedList<>();
		lst.add("ZWHITA");
		lst.add("RED");
		lst.add("BLUE");
		lst.add("YALLOWZ");
		System.out.println(lst);

		for (String each : lst) {
			if (each.contains("A") && each.contains("Z")) {
				lst.remove(each);
			}
		}

		for (int i = 0; i < lst.size(); i++) {
			if (lst.get(i).contains("A") && lst.get(i).contains("Z")) {

				lst.remove(i);

			}
		}
		System.out.println(lst);

		// Iterator<String> lstIterator = lst.iterator();
		// while(lstIterator.hasNext()) {
		//
		// String target = lstIterator.next() ;
		//
		// if(target.contains("A") && target.contains("Z") ) {
		//
		// lstIterator.remove();
		//
		// }
		//
		// }
		// System.out.println( lst );

	}

}
