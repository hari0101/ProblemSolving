package day2_practicalwork;

import java.util.Scanner;

public class LeftRotateByOnePos {

	// Write a program to left rotate an array by one position
	// input : [1, 2, 3, 4, 5], Output : [ 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array size & elements : ");
		int inputSize = scan.nextInt();
		
		int[] arr = new int[inputSize];
		
		for(int i=0; i<inputSize; i++) {
			arr[i] = scan.nextInt();
		}

		//Left rotate the array by 2 positions
		int pos = 1;
		int[] result = leftRotateByOne(arr, pos);
	
		for(int left : result) {
			System.out.print(left + " ");
		}
		scan.close();
	}
	
	private static int[] leftRotateByOne(int[] arr, int pos) {
		
		int len = arr.length;
		pos = pos % len;
		
		//Reverse the pos no. of elements
		reverse(arr, 0, pos - 1);
		// Reverse the rest of the elements in the array.
		reverse(arr, pos, len - 1);
		//Reverse the entrie double reversed array!
		reverse(arr, 0, len - 1);
		
		return arr;
	}
	
	private static void reverse(int[] arr, int start, int end) {
		
		while(start < end) {
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
		
	}
	
	
	
	
	
	
	
}
