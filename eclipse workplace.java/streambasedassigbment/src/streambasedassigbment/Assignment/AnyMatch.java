package streambasedassigbment.Assignment;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 55, 99, 150, 75);

        // Check if any number > 100
        boolean result = numbers.stream()
                                .anyMatch(n -> n > 100);

        System.out.println("The number greater than 100 . " + result);
	}

}
