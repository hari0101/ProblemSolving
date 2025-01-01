package day2_practicalwork;

import java.util.Scanner;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array size & sorted elements of array one : ");
		int arr1Size = scan.nextInt();
		
		int[] arr1 = new int[arr1Size];
		
		for(int i=0; i<arr1Size; i++) {
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("Enter the Array size & sorted elements of array two : ");
		int arr2Size = scan.nextInt();
		
		int[] arr2 = new int[arr2Size];
		
		for(int i=0; i<arr2Size; i++) {
			arr2[i] = scan.nextInt();
		}
		
		int[] result = mergeSortedArray(arr1, arr2);
		
		for(int arr : result) {
			System.out.print(arr + " ");
		}
		
		scan.close();
	}	
	
	private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		int[] arr3 = new int[len1 + len2];  
		
		int i = 0, j = 0, k = 0;    
		
		// arr1 - 2 4 6 8  
		// arr2 - 1 3 5 
		while(i < len1 && j < len2) {
			if(arr1[i] <= arr2[j]) {
				arr3[k++] = arr1[i++];	
			}
			else{
				arr3[k++] = arr2[j++];
			}
			
		}
		
		while (i < len1) {
			arr3[k++] = arr1[i++];
		}
		
		while (j < len2){
			arr3[k++] = arr2[j++];
		}
		
		return arr3;
		
	}
	
	
	
}
