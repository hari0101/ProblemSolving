package day6_practicalwork;

import java.util.Scanner;

public class MaximumInCircularSortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//new Array
		int size = scan.nextInt();
		int[] max = new int[size];
		for(int i = 0; i<max.length; i++) {
			max[i] = scan.nextInt();
		}
		
		int result = findMaxInCircularSortedArray(max);
		System.out.println(result);
		
		scan.close();
	}

	// Method to find the maximum element in a circular sorted array
	static int findMaxInCircularSortedArray(int[] arr) {
		int left = 0, right = arr.length - 1;

		// Binary search loop
		while (left <= right) {
			// If the array is not rotated (it's a normal sorted array)
			if (arr[left] <= arr[right]) {
				return arr[right];
			}

			int mid = (left + right) / 2;

			// Check if mid is the maximum element
			if (arr[mid] > arr[mid + 1]) {
				return arr[mid];
			}

			// Move the search range based on the middle element
			if (arr[mid] >= arr[left]) {
				// Left half is sorted, search in the right half
				left = mid + 1;
			} else {
				// Right half is sorted, search in the left half
				right = mid - 1;
			}
		}

		return -1; // This line should never be reached if the array is valid
	}

}


