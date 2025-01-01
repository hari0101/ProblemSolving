package day2_practicalwork;

import java.util.Scanner;

public class FindIndexOfAnyElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array size & elements : ");
		int inputSize = scan.nextInt();
		
		int[] arr = new int[inputSize];
		
		for(int i=0; i<inputSize; i++) {
			arr[i] = scan.nextInt();
		}
		
		int element = scan.nextInt();
		
		int result = getIndexOfElement(arr, element);
		
		System.out.println(result);
		scan.close();
	
	}
	
	private static int getIndexOfElement(int[] arr, int elmt) {
		
		if(arr.length == 0) {
			return -1;
		}
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == elmt) {
				index = i;
			}
		}
			
		return index;
	}
	
}
