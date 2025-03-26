package NewMap;

import java.util.TreeMap;

public class Treemapinjava {
	public static void main(String[] args) {
//		TreeMap<Integer,String> treemap = new TreeMap<>();
		TreeMap<Integer,String> treemap = new TreeMap<>((a,b)->b-a); //sorted from ascending to descending order,when we give b+a then it go from descending to ascending order
		treemap.put(1, "one");
		treemap.put(3, "two");
		treemap.put(6, "three");
		treemap.put(5, "two");
		System.out.println(treemap);
		treemap.remove(5);
		System.out.println(treemap.containsKey(5));
		System.out.println(treemap.containsValue("two"));
	

}
}
