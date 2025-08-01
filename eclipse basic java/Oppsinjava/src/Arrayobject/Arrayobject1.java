package Arrayobject;

class Student{
	public String name;
	public int roll;
	
}

public class Arrayobject1 {
	
	public static void main(String[] args) {
		
		Student[] std1 = new Student[2];
		std1[0] = new Student();
		std1[0].name = "Nithya";
		std1[0].roll = 21;
		
		std1[1] = new Student();
		std1[1].name = "Shwetha";
		std1[1].roll = 23;
		
		for(int i=0; i<2; i++) {
			System.out.println("The studen name is" +std1[i].name);
			System.out.println("The studen roll is" +std1[i].roll);
			
		}
	}

}
