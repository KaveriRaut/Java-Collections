package MyCollections;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

//add(val), add(idx,val), contains(val), addAll(newList), remove(idx), remove(Integer.valueOf(val)), get(idx), clear(), removeFirst(),
//set(idx,val), size(), isEmpty(), toArray(), toString(), subList(idx1,idx2)
public class MyArraylist {

	public static void main(String[] args) 
	{
			//List<Integer> list = new ArrayList<>();
			//List<Integer> list = new LinkedList<>();
			ArrayList<Integer> list = new ArrayList<>();
			
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(70);
			list.add(80);
			list.add(90);
			System.out.println(list);
			
			list.add(1,50);
			System.out.println(list);
			
			list.set(3, 75);
			System.out.println(list);
			
			System.out.println(list.contains(20));
			System.out.println(list.contains(40));
			
			list.remove(1);
			System.out.println(list);
			
			list.remove(Integer.valueOf(30));
			System.out.println(list);
			
			System.out.println(list.get(1));
			
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
			
			for(Integer ele: list) {
				System.out.print(ele+" ");
			}
			
			list.removeFirst();
			System.out.println("\n"+list);
			
			System.out.println(list.subList(1, 4));
			
			list.clear();
			System.out.println(list);
	}

}
