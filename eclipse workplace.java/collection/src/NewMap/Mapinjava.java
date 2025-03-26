package NewMap;

import java.util.HashMap;
import java.util.Map;

public class Mapinjava {
	public static void main(String[] args) {
		/*
		 * Map:
		 * ====
		 * elemnts stored in the form of key-values
		 * when you represent a group of individual objects as a single entity in the form of key-value pairs then we should go for map interface
		 * put-operation for insertion*/
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"one");
		map.put(1,"ten");
		map.put(2,"two");
		map.put(3,"three");
		System.out.println(map);
		map.remove(3);
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("two"));
		
	}

}
