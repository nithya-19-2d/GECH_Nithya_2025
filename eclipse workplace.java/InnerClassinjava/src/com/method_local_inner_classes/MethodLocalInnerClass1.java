package com.method_local_inner_classes;

public class MethodLocalInnerClass1 {

	public int a = 10;
	public static int b = 30;

	public void ma() {
		class Inner {
			public void m2() {
				System.out.println(a + " " + b);
			}
		}
		Inner in = new Inner();
		in.m2();
	}

	public static void main(String[] args) {
		new MethodLocalInnerClass1().ma();
	}

}
