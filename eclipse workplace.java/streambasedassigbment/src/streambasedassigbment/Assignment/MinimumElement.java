package streambasedassigbment.Assignment;

import java.util.Arrays;
import java.util.List;

public class MinimumElement {
	//mimimum element
	public static void main(String[] args) {
		
		List<Integer> minimun = Arrays.asList(16 , 21 , 12 , 34 , 56 , 78);
		
		int mini = minimun.stream().min((a , b)->(b<a)? 1 :-1).get();
		//int mini = minimun.stream().min(Integer::compare).get();
		System.out.println(mini);
		
	}

}
