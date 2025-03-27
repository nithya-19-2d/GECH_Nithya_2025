package com.functionalinterface;

@FunctionalInterface  //this annotation is does not allowed for creating a multiple abstract method.(its optional)
interface interface1{
	public void display();
}

class Display implements interface1{

	@Override
	public void display() {
		System.out.println("hello varsha");
		
	}
	
}

public class FunctionalInterfaceinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display dis = new Display();
		dis.display();

	}

}
