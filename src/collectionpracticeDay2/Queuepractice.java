package collectionpracticeDay2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Queuepractice {

	public static void main(String[] args) {

//		Queue<Integer> que = new LinkedList<>();
//		que.add(2);
//		que.add(1);
//		que.add(3);
//		que.add(6);
//		que.add(9);		

//		System.out.println( que );
//
//		System.out.println( que.remove() ) ;
//		System.out.println( que.remove() ) ;
//		System.out.println( que.remove() ) ;
//		System.out.println( que.remove() ) ;
//		System.out.println( que.remove() ) ;

//		Deque<Integer> dq = new ArrayDeque<>();
//		dq.add(2);
//		dq.add(1);
//		dq.add(3);
//		dq.add(6);
//		dq.add(9);	
//		
//		System.out.println( dq );
//		System.out.println(  dq.removeLast() );
//		System.out.println(  dq.removeLast()  );
//		System.out.println(  dq.removeLast()  );
//		System.out.println(  dq.removeLast()  );
//		System.out.println(  dq.removeLast()  );
//		

//		String[] array = {"apple", "orange"};
//		System.out.println(Arrays.asList(array));
//		List<String> list = Arrays.asList("apple", "orange"); 

//		Map<String,Integer> records = new HashMap<>();
//		
//		records.put("apple", 1);
//		
//		for(Map.Entry<String, Integer> map: records.entrySet()) {
//			System.out.println(map.getKey()+" :: "+map.getValue());
//		}
//		if(records.containsKey("orange")) {
//			System.out.println(records.get("orange").toString());
//		}

		List<String> list = new ArrayList<>();
		list.add("orange");
		list.add("apple");
		list.add("lemon");
		System.out.println(list);
		list = list.stream().filter(b -> b.equals("orange")).collect(Collectors.toList());
		System.out.println(list);
//		List<Map<String ,Integer>> listOfMaps = new ArrayList<Map<String,Integer>>();
//		
//		listOfMaps.add(records);
//		System.out.println(listOfMaps);
//		
//		for(Map<String, Integer> record: listOfMaps) {
//			System.out.println(record.get("apple"));
//		}
//		Set<String> values2 = new HashSet<>();
//		values2.add("orange");
//		values2.add("orange");
//		values2.add("apple");
//		values2.add("grape");
//		System.out.println(values2);
//		
//		Iterator<String> it = values2.iterator();
//		
//		for(String st: values2) {
//			System.out.println(st);
//		}
//		
//		System.out.println(":::");
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		

	}

}
