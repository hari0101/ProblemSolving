package day1_practicalwork;

import java.util.Scanner;

public class FindMinMaxArray {
	
	//4. WAP to find the minimum and maximum element in the given array
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array size & Array elements : ");
		int arrayLen = scan.nextInt();
		
		int[] arr = new int[arrayLen];
		
		for(int i=0; i<arrayLen; i++) {
			arr[i] = scan.nextInt();
		}
		
		arrayMinMax(arr);
		
		scan.close();
	}

	private static void arrayMinMax(int[] input) {
		
		if(input.length == 0) {
			System.err.println("Array is Empty!!");
		}
		
		int min = input[0];
		int max = input[0]; 
		
		for(int i=1; i<input.length; i++) {
			if(input[i] > max) {                       
				max = input[i];
			}
			else if(input[i] < min){
				min = input[i];
			}
		}
		
		System.out.println("Minimum value : " + min);
		System.out.println("Maximum value : " + max);
	}
	
	
}
