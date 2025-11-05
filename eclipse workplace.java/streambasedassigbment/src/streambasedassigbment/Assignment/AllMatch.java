package streambasedassigbment.Assignment;

import java.util.Arrays;
import java.util.List;

public class AllMatch {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(150, 200, 250, 101);

        // Check if all numbers > 100
        boolean result = numbers.stream()
                                .allMatch(n -> n > 100);

        System.out.println("The all numbers greater than 100. " + result);
	}

}
