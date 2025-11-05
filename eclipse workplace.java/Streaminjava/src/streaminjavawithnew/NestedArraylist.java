package streaminjavawithnew;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class NestedArraylist {
	public static void main(String[] args) {
		
		//nested arraylist
		
		List<List<Integer>> lis = Arrays.asList(Arrays.asList(1 , 2) , Arrays.asList(3 , 4));
		System.out.println(lis); //[[1,2],[3,4]]
		System.out.println(lis.get(0)); //[1,2]
		System.out.println(lis.get(1)); //[3,4]
		System.out.println(lis.get(0).get(0)); //[1,2]=> 0th index => 1
		
		//convert the nested array into single arraylist => use flatmap
		//List<Integer> flatemap = lis.stream().flatMap(s->s.stream()).collect(Collectors.toList());
		List<Integer> flatemap = lis.stream().flatMap(Collection::stream).collect(Collectors.toList());  //we can write like this also.
		System.out.println(flatemap);  //output=> [1,2,3,4]
	}

}
