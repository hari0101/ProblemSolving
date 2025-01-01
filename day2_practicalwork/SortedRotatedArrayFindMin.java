package day2_practicalwork;

import java.util.Scanner;

public class SortedRotatedArrayFindMin {
	
	// Given a rotated sorted array, find the minimum element. Assume there are no duplicate elements in the
	// array. For example, in the array [4, 5, 6, 7, 0, 1, 2], the minimum element is 0.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array size & Array elements : ");
		int arrayLen = scan.nextInt();
		
		int[] arr = new int[arrayLen];
		
		for(int i=0; i<arrayLen; i++) {
			arr[i] = scan.nextInt();
		}
		
		int result = findMininumElement(arr);
		System.out.println(result);
		
		scan.close();
	}
	
	private static int findMininumElement(int[] arr) {
		
		int start= 0, end = arr.length-1;
		
		while(start < end) {
			int mid = start + (end - start) / 2;
			
			if(arr[mid] > arr[end]) {
				start = mid + 1;
			}
			else
			{
				end = mid;
			}
			
		}
		
		return arr[start];
	}
}
