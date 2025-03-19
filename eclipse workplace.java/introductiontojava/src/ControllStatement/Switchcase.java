package ControllStatement;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int day = sc.nextInt();
		switch(day) {
		case 1->
		System.out.println(""
				+ "");
		
	case 2 -> System.out.println("tuesday");
		
	
	case 3 ->
		System.out.println("wednesday");
		
	case 4-> 
		System.out.println("tursday");
		
	case 5 ->
		System.out.println("friday");
		
	case 6 -> 
		System.out.println("weekend");
		
	case 7 -> 
	System.out.println("weekend");
		
	default->
		System.out.println("invalid");
		
	}
		//we can do these way also
//		switch(day) {
//		case 1,2,3,4,5 ->System.out.println("weekdays");
//		case 6,7->System.out.println("weekend");
//		default->System.out.println("invald");
//		}
		
		String res = switch(day) {
		case 1,2,3,4,5-> "weekdays";
		case 6,7 ->"weekend";
		default ->"invalid";
		};
		System.out.println("the result is:" +res);
	}

	}


