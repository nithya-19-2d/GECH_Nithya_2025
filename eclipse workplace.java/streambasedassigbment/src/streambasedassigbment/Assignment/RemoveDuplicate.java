package streambasedassigbment.Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		List<Integer> lis = Arrays.asList(12, 13 , 14 , 12 , 15 , 16 , 13);
		
		List<Integer> dis = lis.stream().distinct().collect(Collectors.toList());
		System.out.println(dis);
	}

}
