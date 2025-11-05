package method_and_constructor_reference;

import java.util.function.Supplier;

public class InstanceMethodReference {
	
	public String getMessage() {
		return "The instance method";
	}
	
	public static void main(String[] args) {
		InstanceMethodReference ire1 = new InstanceMethodReference();
		//without instance reference
		Supplier<String> sup = ()->ire1.getMessage();
		System.out.println(sup.get());
		//with instance referenceb
		Supplier<String> sup1 = ire1::getMessage;
		System.out.println(sup1.get());
	}

}
