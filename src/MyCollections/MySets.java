package MyCollections;

import java.util.Set; //Set interface => store unique items only
import java.util.HashSet; // like unordered set => order not maintained
import java.util.LinkedHashSet; // like ordered set, maintain order of items as inserted
import java.util.TreeSet; //like Sorted set-> keeps items sorted using BST

// same methods applied to all set types (TreeSet has extra methods)
// HashSet/LinkedHashSet => add, remove, contains, clear, equals, isEmpty, Size,
// TreeSet => removeFirst, removeLast, add, First, getFirst, last, getLast, (with all above methods)

public class MySets {

	public static void main(String[] args) {
		
		// Set<Integer> s = new LinkedHashSet<>();  //ordered set
		Set<Integer> s = new HashSet<>();   //unordered set
		
		s.add(600);
		s.add(100);
		s.add(500);
		s.add(200);
		s.add(200);
		System.out.println(s); //store only unique items
		
		s.remove(100);
		System.out.println(s);
		
		System.out.println(s.size());
		System.out.println(s.contains(600));
		System.out.println(s.isEmpty());
		
		for(Integer val:s) {
			System.out.print(val+" ");
		}
		
		s.clear();
		System.out.println(s);
		
		//--------------------TreeSet---------------------------//
		System.out.println("TreeSet->>>>>>>>>>>>>>>>>>>>");
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(50);
		ts.add(10);
		ts.add(40);
		ts.add(20);
		ts.add(60);
		ts.add(30);
		System.out.println(ts);
		
		ts.remove(20);
		ts.removeFirst();
		ts.removeLast();
		System.out.println(ts);
		
		System.out.println(ts.first());
		System.out.println(ts.getFirst());
		
		System.out.println(ts.last());
		System.out.println(ts.getLast());
	}

}
