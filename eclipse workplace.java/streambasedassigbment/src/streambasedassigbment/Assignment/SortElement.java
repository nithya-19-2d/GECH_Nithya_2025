package streambasedassigbment.Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortElement {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 1 , 3 ,5 ,7 ,4 ,10);
		System.out.println("List before sorting:" +list);
		//Collections.sort(list, (a , b)->b-a);
		//System.out.println("After sorting "+list);
		
		//using streams
		List<Integer> nums =  list.stream().sorted((a,b)->b-a).collect(Collectors.toList());
		System.out.println(nums);
		
		 
	}

}
