package StringsandArray;

import java.util.Arrays;

public class substring {
	public static void main(String[] args) {
		
		int[] arr= {1, 2, 20 , 3 , 10};
		
		int[] subarr = Arrays.copyOfRange(arr, 2, 5);
		System.out.println(Arrays.toString(subarr));
		
	}

}
