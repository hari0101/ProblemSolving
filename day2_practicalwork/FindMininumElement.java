package day2_practicalwork;

import java.util.Scanner;

public class FindMininumElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array size & elements : ");
		int inputSize = scan.nextInt();
		
		int[] arr = new int[inputSize];
		
		for(int i=0; i<inputSize; i++) {
			arr[i] = scan.nextInt();
		}
		
		int min = findMinimumValue(arr);
		
		System.out.println("Minimum value : " + min);
		scan.close();
	}
	
	private static int findMinimumValue(int[] arr) {
		
		if(arr.length < 1) {
			return -1;
		}
		
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}	
