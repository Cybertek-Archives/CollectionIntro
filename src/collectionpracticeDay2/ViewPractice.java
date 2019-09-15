package collectionpracticeDay2;

import java.util.SortedSet;
import java.util.TreeSet;

public class ViewPractice {

	public static void main(String[] args) {

		SortedSet<String> sSet = new TreeSet<>();
		sSet.add("A");
		sSet.add("A");
		sSet.add("z");
		sSet.add("b");
		sSet.add("B");
		sSet.add(" ");
		sSet.add("9");

		System.out.println(sSet);

		System.out.println(sSet.subSet("9", "z"));
		System.out.println(sSet.subSet("8", "{"));

		System.out.println(sSet.headSet("B"));
		System.out.println(sSet.tailSet("B"));

	}

}
