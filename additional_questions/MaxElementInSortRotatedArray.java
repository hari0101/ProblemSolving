package additional_questions;

import java.util.Scanner;

public class MaxElementInSortRotatedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array size & Array elements : ");
		int arrayLen = scan.nextInt();
		
		int[] arr = new int[arrayLen];
		
		for(int i=0; i<arrayLen; i++) {
			arr[i] = scan.nextInt();
		}
		
		int max = getMaxElement(arr);
		
		System.out.println(max);
		scan.close();
	}
	
	private static int getMaxElement(int[] arr) {
		int minindex = getMinValueIndex(arr);
		return arr[minindex - 1 + arr.length % arr.length];
		
		
	}
	
	private static int getMinValueIndex(int[] arr) {
		int start = 0, end = arr.length-1, mid;
		//4 5 6 7 0 1 2
		while(start <= end) {
			mid = start + (end - start) / 2; 
			
			if(arr[mid] > arr[end]) {
				start = mid + 1;
			}
			else
			{
				end = mid;
			}
		}
		
		return start;
	}
	
	
	
	
}
