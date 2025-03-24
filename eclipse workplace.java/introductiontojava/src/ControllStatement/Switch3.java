package ControllStatement;

//we can pass the 'object', also in java 
public class Switch3 {
	public static void main(String[] args) {
    Object obj = "hello world";
     obj = 1;
    
    switch(obj) {
    case String s: {
    	System.out.println("the type is:"+s);
    	break;
    }
    case Integer i: { 
    	System.out.println("the type is integer:"+i);
    	break;
    }
    
    default: { System.out.println("invalid type");
    }
    }
}
}
