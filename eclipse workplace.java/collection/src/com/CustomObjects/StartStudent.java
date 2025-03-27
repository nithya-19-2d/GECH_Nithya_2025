package com.CustomObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StartStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student("nithya", 23, 23);
		Student std2 = new Student("nita", 20, 21);
		Student std3 = new Student("varsha", 24, 25);
		Student std4 = new Student("akshatha", 27, 22);//type of std1 is student
		List<Student> list = new ArrayList<>();
		list.add(std1);
		list.add(std2);
		list.add(std3);
		list.add(std4);
		System.out.println(list);
		list.add(new Student("sinch",21, 34));
		System.out.println(list);
		list.remove(0);
		System.out.println(list);		
//		System.out.println(std1);
		//comaparator->is functional operator and it containes one abstract method
		//(s1,s2)->this is a lambda expression, it is only applies to functional interface(Comparator) ,function interface means doesnot contain function_name, access-modifier
//		Collections.sort(list,(s1,s2)-> s1.getRool_num()-s2.getRool_num());//ascending
		Collections.sort(list,(s1,s2)-> s2.getRool_num()-s1.getRool_num());//descending
		System.out.println("after roll");
		System.out.println(list);
		Collections.sort(list,(s1,s2)-> s2.getAge()-s1.getAge());//descending
		System.out.println("after age");
		System.out.println(list);

	}

}
