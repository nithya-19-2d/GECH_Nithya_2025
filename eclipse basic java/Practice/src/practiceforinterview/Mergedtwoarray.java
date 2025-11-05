package practiceforinterview;

import java.util.Scanner;

public class Mergedtwoarray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the size ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		System.out.println("Enter the sorted array list");
		for(int i=0; i<n ;i++) {
			arr1[i] = sc.nextInt();
			
		}
		System.out.println("Enter the sorted array list");
		for(int i=0; i<n ;i++) {
			arr2[i] = sc.nextInt();
			
		}
		
		int[] merged = new int[arr1.length+arr2.length];
		int i=0, j=0, k=0;
        while(i< arr1.length&& j<arr2.length){
            if(arr1[i] <= arr2[j]){
            	merged[k++] = arr1[i++];
                
                
            }
            else{
            	merged[k++] = arr2[j++];
                
            }
        }

        while(i<arr1.length){
        	merged[k++] = arr1[i++];
        }
        while(j<arr2.length){
        	merged[k++] = arr2[j++];
        }
       // System.out.println(merged[0]);

        for(int array : merged){  // cant access the indexed value using foe each value
        	System.out.print(array);
        }
        
        System.out.println();
        }
            
		
	}


