package ControllStatement;

//we can pass the 'object', also in java 
public class Switch3 {
    Object obj = "hello world";
    switch(obj) {
    case String s -> System.out.println(String type);
    case Integer i -> System.out.println(Integer type);
    default -> System.out.println("invalid type");
    }
}
