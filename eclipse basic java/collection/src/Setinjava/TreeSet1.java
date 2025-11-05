package Setinjava;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet1 {
	
	public static void main(String[] args) {
		
		TreeSet<String> t1  = new TreeSet<>(Comparator.reverseOrder()); 
		
		t1.add("Nithya");
		t1.add("Shwetha");
		t1.add("Rakshitha");
		t1.add("Swathi");
		
		System.out.println(t1);
		
		
		//TreeSet<Integer> t2 = new TreeSet<>((a1 , a2)->a2-a1);
		TreeSet<Integer> t2 = new TreeSet<>();
		t2.add(200);
		t2.add(200);
		t2.add(500);
		t2.add(100);
		t2.add(400);
		//t2.add(null); //its show nullpointerexception
		System.out.println(t2);
		
		
		
	}

}
