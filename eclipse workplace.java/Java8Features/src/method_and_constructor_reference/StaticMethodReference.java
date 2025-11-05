package method_and_constructor_reference;

import java.util.function.Consumer;

public class StaticMethodReference {
	
	public static void printmessage(String msg) {
		System.out.println("you message is:" +msg);
	}
	public static void main(String[] args) {
		//without static method reference
		Consumer<String> con = s->StaticMethodReference.printmessage(s);
		con.accept("without static");
		//with static method reference
		Consumer<String> con1 = StaticMethodReference::printmessage;
		con1.accept("hello world");
	}

}
