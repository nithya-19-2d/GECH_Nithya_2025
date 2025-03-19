package loopingstatement;

public class Loopingstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         * for loop
         * while loop
         * do-while loop
         * for each loop*/
		System.out.println("for loop");
		int[] number = {1,2,3,4,5};
//		System.out.println("array element are:");
//		for(int i=0; i<3; i++ ) {
//			System.out.println(number[i]);
//		}
		
		//for each
//		int[] arr = {1,2,3,4,5};
//		for(int a:arr) {
//			System.out.println(a);
//		}
		
		//for loop
		/*
		 *  */
		int i=0;
//		while(i<=number.length) {
//			System.out.println("the elements are:");
//			i++;
//		}
		do {
			
			System.out.println(number[i]);
			i++;
		}while(i<=4);
		
	}

}
