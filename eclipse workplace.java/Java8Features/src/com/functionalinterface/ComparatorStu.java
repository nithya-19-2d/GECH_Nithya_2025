package com.functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class functioncompare implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2-o1;   // this is before java 8 , is used
	}
	
}

public class ComparatorStu {
	
	public static void main(String[] args) {
		
		List<Integer> marks = new ArrayList<>();
		
		marks.add(35);
		marks.add(80);
		marks.add(85);
		marks.add(90);
		marks.add(75);
		marks.add(100);
		
		System.out.println(marks);
		Collections.sort(marks, (a,b)->b-a);
		System.out.println("After sorting: "+marks);
		Collections.sort(marks, new functioncompare());
		System.out.println("Extending Comparator : " +marks);
		
		Scanner sc = new Scanner(System.in);
		List<Integer> student = new ArrayList<>();
		for(int i=0; i<5; i++) {
			System.out.println("Enter "+ (i+1)  +" Student Marks");
			student.add(sc.nextInt());
		}
		
		System.out.println(student);
		Collections.sort(student, (a,b)->b-a);
		System.out.println("After sorting " +student);
		
		
		
		
		
	}

}
