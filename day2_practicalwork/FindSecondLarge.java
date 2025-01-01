package day2_practicalwork;

import java.util.Scanner;

public class FindSecondLarge {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array size & elements : ");
		int inputSize = scan.nextInt();
		
		int[] arr = new int[inputSize];
		
		for(int i=0; i<inputSize; i++) {
			arr[i] = scan.nextInt();
		}
		
		int result = findSecondLargestElement(arr);
		
		if(result == -1) {
			System.out.println("No second largest element");
		}
		else
		{
			System.out.println("The second largest element : " + result);
		}
		
		scan.close();
	}
	
	private static int findSecondLargestElement(int[] arr) {
		
		int large = arr[0];  //10
		int large2 = arr[0]; //7
		
		if(arr == null || arr.length < 2) {
			return -1;
		}
		
		//7 10 1 9 11 12
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > large) {
				large2 = large;
				large = arr[i];	
			}
			if(arr[i] > large2 && arr[i] < large) {
				large2 = arr[i];
			}
		}
		
		if(large == large2) {
			return -1;
		}
		
		return large2;
		
	}
}
