package additional_questions;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	
	//Insertion sort is simple comparsion-based algorithm where elements are sorted by one element at time from the unsorted selection.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array size & elements : ");
		int inputSize = scan.nextInt();
		
		int[] arr = new int[inputSize];
		
		for(int i=0; i<inputSize; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] result = insertionSort(arr);
		
		System.out.println(Arrays.toString(result));
		scan.close();
	}	
	
	static int[] insertionSort(int[] arr) {
		// 0 1 2 3  4
		// 5 9 2 10 12
		for(int i = 0; i<arr.length-1; i++) {
			
			for(int j=i+1; j>0; j--) {
				if(arr[j] < arr[j-1]) {    
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else
				{
					break;
				}
			}
			
		}
		
		return arr;
	}
}
