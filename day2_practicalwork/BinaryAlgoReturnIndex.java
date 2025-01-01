package day2_practicalwork;

import java.util.Scanner;

public class BinaryAlgoReturnIndex {
	
	//Return the specific element index using binary search algorithm.
	// IMPORTANT : works only for the Sorted array.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array size & elements : ");
		int inputSize = scan.nextInt();
		
		int[] arr = new int[inputSize];
		for(int i=0; i<inputSize; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the target element to find the index : ");
		int target = scan.nextInt();
		
		int size = binarySearchIndex(arr, target);
		System.out.println(size);
		scan.close();
	}
	
	private static int binarySearchIndex(int[] arr, int target) {
		
		if(arr.length == 0) {
			return -1;
		}
		
		
		int endpoint = arr.length-1, start = 0;
		
		while(start <= endpoint) {
			int mid = start + (endpoint - start) / 2; 
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(target < arr[mid]) {
				endpoint = mid - 1;
			}
			else
			{
				start = mid + 1;
			}
			
		}
		return -1;
		
	}
	
	
}
