package DailyAssignment;

interface Animal{
	public void eat();
	public void makeSounds();
	}


class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("the dog eat meat");
	
}

	@Override
	public void makeSounds() {
		// TODO Auto-generated method stub
		
	}
}

class cat extends Dog{
	public void makeSound() {
		System.out.println("the cat make sounds");
	}
}
	

	

public class CatDogAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cat sound = new cat();
		sound.makeSound();
		sound.eat();

	}

}












