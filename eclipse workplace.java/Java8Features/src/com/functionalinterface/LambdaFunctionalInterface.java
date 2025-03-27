package com.functionalinterface;

interface Interface2{
	public void display();
}

interface interface3{
	public int string(String s);  //string() is method
}

interface interface4{
	public int add(int a, int b);
}

public class LambdaFunctionalInterface {
	public static void main(String[] args) {
		
		//when there is functional interface use lambda expression
		//type for the lambda expression is interface_name
		//when we use the multiple abstract method in functional interface, lambda expression shows the compile time error
		
		//this is lambda expression
		Interface2 i=()->System.out.println("hello world");
		 i.display();
		
		 //lambda expression for String , here length is  a integer
		 interface3 k = s-> s.length();
		 int res = k.string("hello world");
		 System.out.println("Result:"+res);
		 
		 //lambda expression for adding
		 interface4 j=(int a, int b)->{
			 return a+b;
			 };
			 int a = j.add(2,3);
			 System.out.println("result:"+a);
			 
			 
			 
		 }
		
	}


