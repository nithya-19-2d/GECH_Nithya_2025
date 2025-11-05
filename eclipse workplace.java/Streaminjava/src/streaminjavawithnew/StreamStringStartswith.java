package streaminjavawithnew;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStringStartswith {
	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("Nithya","shwtha","Anil");
		//name.stream().filter(s->s.startsWith("A")).forEach(System.out::println); => output => Anil
		
		//after filtering , again to list the filtered name , we use collect(Collectors.toList()) => collect is a method which uses Collectors and to store in list use toList
		List<String> collects = name.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
		System.out.println(collects);  // output is=> [Anil]
		
		
	}

}
