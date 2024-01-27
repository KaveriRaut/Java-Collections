package MyCollections;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import java.util.Queue;
import java.util.PriorityQueue;

import java.util.Deque;
import java.util.ArrayDeque;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;


public class AllCollectionsDeclaration {

	public static void main(String[] args) {
		
		// methods are same for all classes implemented under same interface (i.e. List, Queue, Map, Set)
		
		//-----------------------------------------------------------------------//
		// List -> ArrayList (ArrayList implementation)
		List<String> arr1 = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();
		
		// List -> LinkedList (LikedList implementation)
		List<String> ll1 = new LinkedList<>();
		LinkedList<Integer> ll2 = new LinkedList<>();
		
		// List -> Vector (Vector implementation)
		List<String> vec1 = new Vector<>();
		Vector<String> vec2 = new Vector<>();
		
		//-----------------------------------------------------------------------//
		Stack<Integer> st = new Stack<>();

		//-----------------------------------------------------------------------//
		// Queue -> LinkedList (Queue implementation using LL)
		Queue<String> q1 = new LinkedList<>();
		
		// Queue -> PriorityQueue implementation (having priority)(act as MinHeap by default)
		Queue<String> q2 = new PriorityQueue<>();
		PriorityQueue<String> q3 = new PriorityQueue<>();
		
		// Queue -> ArrayDeque (deque: enter or exit from both ends)
		Deque<Integer> dq2 = new ArrayDeque<>(); //uses Stack interface
		Deque<Integer> dq3 = new LinkedList<>(); //uses only Queue interface
		ArrayDeque<Integer> dq4 = new ArrayDeque<>();
		
		//-----------------------------------------------------------------------//
		// Set -> HashSet (its like unordered set)
		Set<Integer> s1 = new HashSet<>();
		HashSet<Integer> s2 = new HashSet<>();
		
		// Set -> LinkedHashSet (its like ordered set, maintain order as per input)
		Set<Integer> s3 = new LinkedHashSet<>();
		LinkedHashSet<Integer> s4 = new LinkedHashSet<>();
		
		// Set -> TreeSet (it maintain sorted order using BST)
		Set<String> s5 = new TreeSet<>();
		TreeSet<String> s6 = new TreeSet<>(); // prefer this***
		
		//-----------------------------------------------------------------------//
		// Map -> HashMap (its like unordered map)
		Map<String, Integer> mp1 = new HashMap<>();
		HashMap<String, Integer> mp2 = new HashMap<>();
		
		// Map -> LinkedHashMap (its like ordered map, maintain order as per input)
		Map<String, Integer> mp3 = new LinkedHashMap<>();
		LinkedHashMap<String,Integer> mp4 = new LinkedHashMap<>();
		
		// Map -> TreeMap (maintain Sorted order using BST)
		Map<Integer, Integer> mp5 = new TreeMap<>();
		TreeMap<Integer, Integer> mp6 = new TreeMap<>();
		
	}
	
}
