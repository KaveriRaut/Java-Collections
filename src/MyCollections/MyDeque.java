package MyCollections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;

// addFirst, addLast, peekFirst, peekLast, pollFirst, pollLast, size, isEmpty, clear,
// add/offer, peek/element, poll/remove (First)(Last)

public class MyDeque {

	public static void main(String[] args) {
		
		// Creating a Deque using ArrayDeque
        //Deque<Integer> dq = new LinkedList<>();
		Deque<Integer> dq = new ArrayDeque<>();

        // Adding elements to the front (head) of the deque
        dq.addFirst(10);

        // Adding elements to the end (tail) of the deque
        dq.addLast(200);
        
        dq.add(22); //act as normal push from last 
        System.out.println(dq);

        // Checking if the deque is empty
        System.out.println(dq.isEmpty());

        // Getting the size of the deque
        System.out.println(dq.size());

        // Peeking at the first element without removing it
        System.out.println(dq.peekFirst());

        // Peeking at the last element without removing it
        System.out.println(dq.peekLast());

        
        // Getting and removing the first element from the deque
        System.out.println(dq.pollFirst());

        // Getting and removing the last element from the deque
        System.out.println(dq.pollLast());

        // Accessing elements
        System.out.println("Elements in the deque: " + dq);
		
	}

}
