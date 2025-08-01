package Inheritence;


class TheGranparent{
	
		String name = "thirumalaiah";
		String Fname = "ratnamma";
		public void Grandparent() {
		System.out.println("the grandparent name is:");
	}
}

class TheParentfather extends TheGranparent{
	
	String Pname = "Anil";
		
}

class TheParentMother extends TheGranparent{
	
	String Mname = "Mahalakshmi";
	
}

class ChildBrother extends TheParentMother{
	String Bname = "Nithin";
}

class Childsister extends TheParentMother{
	String Sname = "nithya";
}



public class HeirarchicalInheritence {
	
	public static void main(String[] args) {
		ChildBrother Grand = new  ChildBrother();
		Grand.Grandparent();
		System.out.println("the grandfather name :" +Grand.name);
		System.out.println("the grandmother name :" +Grand.Fname);
		System.out.println("the parent name is:" +Grand.Mname);
		System.out.println("the brother name is:" +Grand.Bname);
		
	}

}
