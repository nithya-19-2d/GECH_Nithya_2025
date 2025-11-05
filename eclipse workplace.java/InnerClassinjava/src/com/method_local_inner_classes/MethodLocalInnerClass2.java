package com.method_local_inner_classes;

public class MethodLocalInnerClass2 {

	public int a = 10;
	public static int b = 30;

	public void ma() {
		int z = 20;
		class Inner {
			int z1 = 22;

			public void m2() {
				System.out.println(a + " " + b + " " + z + " " + z1);
			}
		}
		Inner in = new Inner();
		in.m2();
	}

	public static void main(String[] args) {
		new MethodLocalInnerClass2().ma();
	}

}
