package Mapinjava;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap1 {
	
	public static void main(String[] args) {
		
		/*
		 MAP:
		 ====
		 * when you represent a group of individual object as a single entity in the form of key value pair
		  then we should use map interface
		 * it is in seprate in collection bcs it store in  key value pair 
		 * but it present in collections (collections includes the collection framework)
		  
		  //HashMap
		 *can access through key  not by index
		 *duplicate key value not allowed
		 * gives in --> sorted(by key) map --> default ascending order(by default , it maiataines the ascending key order)
		 * In hashmap, allows null value and  null keys(but already existing null key value will be replaced)
		 
		 */
		
		Map<Integer , String> m2 = new HashMap<>();
		m2.put(0, "Nithya");
		m2.put(1, "Shwetha");
		m2.put(4, "Swathi");
		m2.put(5, "Rakshi");
		m2.put(2, "Sinch");
		m2.put(3, null);
		m2.put(null, "bvhbjh");
		m2.put(null, "zfdghf");
		m2.put(null, "bbhjb");
		m2.put(2, "bhjbj"); //if we use the duplicate key, then the value of already existing key value will be replaced by duplicate key value
		
		System.out.println(m2);
		System.out.println(m2.get(1));
		System.out.println(m2.containsKey(6));//false
		
		
		//to iterate each key and values 
		System.out.println("Using entry set");
		Set<Entry<Integer , String>> entryset = m2.entrySet();
		for(Entry<Integer , String>KeyValue : entryset){
			System.out.println(KeyValue);
		}	
		
		System.out.println("Using forEach");
		m2.forEach((k,v)->System.out.println(k+ "==" +v));
		
		System.out.println("Using keyset method");
		Set<Integer> keySet = m2.keySet();
		for(Integer Key:keySet) {
			System.out.println("key: =>" +Key);
		}	
		
	}

}
