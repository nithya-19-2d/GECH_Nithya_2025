package com.functionalinterface;

@FunctionalInterface
interface FunInterface{
	public int add(int a, int b);
}

interface Stringinter{
	public int len(String s);
}

interface Stringuppercase{
	public String upper(String s);
}
public class Functioninterfacewithlamda {
	
	public static void main(String[] args) {
		
		FunInterface inter	= (a,b) -> a+b;
		int res = inter.add(10, 20);
		System.out.println(res);
		
		Stringinter lenstr = s-> s.length();
		int lenstring= lenstr.len("Nithya");
		System.out.println(lenstring);
		
		Stringuppercase uppercase= s->s.toUpperCase();
		
		String nametoupper = uppercase.upper("nithya");
		System.out.println(nametoupper);
	}

}
