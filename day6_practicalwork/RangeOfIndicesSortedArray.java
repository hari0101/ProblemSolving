package day6_practicalwork;

import java.util.Arrays;
import java.util.Scanner;

public class RangeOfIndicesSortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int[] indices = new int[size];
		
		for(int i = 0; i<indices.length; i++) {
			indices[i] = scan.nextInt();
		
		}
		int target = scan.nextInt();
		int[] result = searchRange(indices, target);
		
		System.out.println(Arrays.toString(result));
		
		scan.close();
	}
	
	//Binary Search technique to find the first element at the left half of the array.
	static int findLeftElement(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Search in the left half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
	
	//Binary Search technique to find the last element at the right half of the array.
	static int findRightElements(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Search in the right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
	
	//searchRange returns the element if not found in the both left or right half.
	static int[] searchRange(int[] arr, int target) {
        int[] result = new int[2];
        result[0] = findLeftElement(arr, target);
        result[1] = findRightElements(arr, target);
        return result;
    }

}