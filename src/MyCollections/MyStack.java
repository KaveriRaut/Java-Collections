package MyCollections;
import java.util.Stack;

//peek, push, pop, size, isEmpty

public class MyStack {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		
		st.push("Kaveri");
		st.push("Krushna");
		st.push("Kanchan");
		
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.println(st.peek());
	}

}
