package streambasedassigbment.Assignment;

import java.util.Arrays;
import java.util.List;

public class ConcatenateString {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Nithya", "Anil", "Nithin");
		String n = list.stream().reduce(" ", (a,b)-> a+b);
		System.out.println(n);
	}

}
