package MyCollections;

import java.util.PriorityQueue;
import java.util.Queue;

//offer/add, peek/element, poll/remove, contains, isEmpty, Size, contains, 

public class MyPriorityQueue {

	public static void main(String[] args) {
		
		//by default high priority to min-value (act as MinHeap by default)
		Queue<Integer> pq = new PriorityQueue<>();
		
		pq.add(50);// add end of the priority queue throw exception 
		pq.offer(80);// add end of the priority queue. don't throw exception
		pq.offer(20);
		
		// top-most element is with highest priority-> by default who has less value is high priority
		System.out.println(pq);  

		System.out.println(pq.peek());// returns the first element of the queue and don't remove
		System.out.println(pq.element());// returns the first element of the queue and don't remove and give exception
		
		//remove item
		System.out.println(pq.poll()); // return first item and remove first item of priority queue
		System.out.println(pq);
		System.out.println(pq.remove());// same as poll but capable to throws an exception
		System.out.println(pq);
		
		System.out.println(pq.size());
		System.out.println(pq.isEmpty());
		System.out.println(pq.contains(80));

	}

}
