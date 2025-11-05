package streaminjavawithnew;

import java.util.Arrays;
import java.util.List;

public class StreamStringUppercase {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("mohan", "nithya", "pavan");
		//names.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		names.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
