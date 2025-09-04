package com.streamsinJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streaminjava1 {
	public static void main(String[] args) {
		//we can't do the two termination operation for single stream
		List<Integer> list = Arrays.asList(12,9,8,6,13,34,25,56);
		Stream<Integer> stream=list.stream().filter((x)->x>10);
		Long res = stream.count();
		System.out.println(res);
		
//		Stream<Integer> st =stream.filter((s)->s<10);
//		Long res1 = st.count();
//		System.out.println(res1); // it shows Exception like this -> stream has already been operated upon or closed
		
		
		//we can't do the two termination operation for single stream
		Long res1 = stream.count();
		System.out.println(res1); //this also shows same Exception
		
		
		
	}

}
