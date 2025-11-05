package method_and_constructor_reference;

import java.util.Arrays;

public class InstanceMethodReference2 {
	public static void main(String[] args) {
		String[] names = {"mohan" , "nithy", "shwetha" ,"swthi"};
		//without InstanceMethodReference2
		//Arrays.sort(names, (a,b)->a.compareToIgnoreCase(b));
		//System.out.println(Arrays.toString(names));
		
		
		//with InstanceMethodReference
		Arrays.sort(names, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(names));
		
		
	}

}
