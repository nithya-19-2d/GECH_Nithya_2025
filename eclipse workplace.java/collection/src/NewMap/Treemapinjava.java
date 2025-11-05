package NewMap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class Treemapinjava {
	public static void main(String[] args) {
//		TreeMap<Integer,String> treemap = new TreeMap<>();
		//SortedMap<Integer, String> treemap = new TreeMap<>((a,b)->b-a);
		TreeMap<Integer, String> treemap = new TreeMap<>((a,b)->b-a);//Comparator.reverseorder() =>this method gives decending order.sorted from ascending to descending order,when we give b+a then it go from descending to ascending order
		treemap.put(1, "one");
		treemap.put(3, "two");
		treemap.put(6, "three");
		treemap.put(5, "two");
		System.out.println(treemap);
		treemap.remove(5);
		System.out.println(treemap.containsKey(5));
		System.out.println(treemap.containsValue("two"));
		System.out.println(treemap.firstKey());;
		System.out.println(treemap.lastKey());
		System.out.println(treemap.subMap(6, 1));
		System.out.println(treemap.get(6));
		System.out.println("sets of keys" +treemap.keySet());
		System.out.println("sets of values" +treemap.values());
		System.out.println("size" +treemap.size());
		treemap.clear();
		System.out.println(treemap);
		
	

}
}
