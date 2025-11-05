package streambasedassigbment.Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class SumOfElement {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 1 , 3 ,5 ,7 ,4);
		
	int n =list.stream().reduce(0, (a,b)->a+b);
		System.out.println(n);
	}

}
