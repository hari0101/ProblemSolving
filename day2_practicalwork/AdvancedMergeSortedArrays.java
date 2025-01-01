package day2_practicalwork;

import java.util.Scanner;

public class AdvancedMergeSortedArrays {

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
		
		advancedMergeTwoSortedArrays(arr1, arr2);
		scan.close();
		}
			
	}
	
	private static void advancedMergeTwoSortedArrays(int[] arr1, int[] arr2) {
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
