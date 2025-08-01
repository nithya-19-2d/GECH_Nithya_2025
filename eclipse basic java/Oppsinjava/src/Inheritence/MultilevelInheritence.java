package Inheritence;

//multilevel
class GrandParent{
	
 String Gname = "Shwetha";

public void Grandparent() {
	System.out.println("the grandparent is");
}
}

class TheParent extends GrandParent{
	
	String name = "Nithya";
	
	public void Parent() {
		System.out.println("the parent name is ");
	}
	
}

public class MultilevelInheritence extends TheParent {
	public static void main(String[] args) {
		
		MultilevelInheritence child = new MultilevelInheritence();
		child.Grandparent();
		System.out.println("the name is :" +child.Gname);
		child.Parent();
		System.out.println("the name is:" +child.name);
		

	}

}
