package streaminjavawithnew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSquarenum {
	public static void main(String[] args) {
		
		//greater than 0 and then Sqaure each one
		List<Integer> num = Arrays.asList(2 , 3 , 4 , 5);
		List<Integer> collects = num.stream().filter(s->(s > 0)).map(s-> s* s).collect(Collectors.toList());
	    System.out.println(collects);
		
	}

}
