package MyCollections;

import java.util.Queue;
import java.util.LinkedList;

//offer/add, peek/element, poll/remove, contains, isEmpty, Size
// 1. offer (insert new element)  OR
//    add (insert new element with exception handling)
// 2. peek (return head element)  OR
//    element (return head element with exception handling)
// 3. poll (return and remove head of queue)
//    remove (return and remove head element with exception handling)

public class MyQueue {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(10);
		q.offer(20);
		q.add(30);
		q.add(40);
		System.out.println(q);
		
		System.out.println(q.peek());
		System.out.println(q.element());
		
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		
		System.out.println(q.contains(20));
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		
		
	}

}
