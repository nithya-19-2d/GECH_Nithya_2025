package streambasedassigbment.Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaximumElement {
	
	public static void main(String[] args) {
		//3. FInd the Maximum element in List
		
		List<Integer> li  = Arrays.asList(24, 16 , 55 , 67 , 87 , 95);
		int  num =  li.stream().max((a,b)->(a>b)? 1 : -1).get();
		//int  num =  li.stream().max(Integer :: compare).get();
		System.out.println(num);
        
	}

}
