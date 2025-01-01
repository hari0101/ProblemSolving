package additional_questions;

import java.util.Scanner;

public class RightRotateArrayByKthPos {

	//Write a java program to rotate the array right side with kth position
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputsize = scan.nextInt();
	
		int[] right = new int[inputsize];
		
		for(int i=0; i<right.length; i++) {
			right[i] = scan.nextInt();
		}
		
		int pos = scan.nextInt();
		int[] result = rotateArrayRight(right, pos);
		printArray(result);
		
		scan.close();
	}
	
	private static int[] rotateArrayRight(int[] arr, int k) {
		
		//Size of the Array
		int n = arr.length;
		//if the k - position is greater than the array size!
		k = k % n; 
		//Reserve the whole array.
		reverse(arr, 0, n-1);
		//Reverse the array based on required position
		reverse(arr, 0, k-1);
		//Reverse the rest of the array elements
		reverse(arr, k, n-1);
	
		return arr;
	}
	
	private static void reverse(int arr[], int start, int end) {
		
		while(start < end) {
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
	}
	
	private static void printArray(int[] arr) {
		
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			
			if(!(i == arr.length-1)) {
				System.out.print(", ");
			}
		}
		
		System.out.print("]");
		
	}
	
}
