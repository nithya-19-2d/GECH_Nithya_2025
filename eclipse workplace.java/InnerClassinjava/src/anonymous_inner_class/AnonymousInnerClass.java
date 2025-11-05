package anonymous_inner_class;

class Person {
	public String name;
	public int age;

	public void isWalking() {
		System.out.println("person is walking");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Person person = new Person() {
			public static int i;
			{//instance block
				name = "nithya";
				age = 21;
			} 
			static { //static block
				i=10;
			}

			public void isWalking() {
				System.out.println("Nithya is walking");
			}
		};
		System.out.println(person.name);
		System.out.println(person.age);
		person.isWalking();

	}

}
