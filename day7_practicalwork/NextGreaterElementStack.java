package day7_practicalwork;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementStack {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//new Array
		int size = scan.nextInt();
		int[] greater = new int[size];
		
		for(int i = 0; i<greater.length; i++) {
			greater[i] = scan.nextInt();
		}
		int[] result = nextGreaterElements(greater);
		System.out.println(Arrays.toString(result));
		scan.close();
	}	

	static int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];  // Result array to store the next greater elements
        Stack<Integer> stack = new Stack<>();
        
        // Initialize result array with -1 (default when no greater element is found)
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }
        
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack that are less than or equal to arr[i]
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            
            // If the stack is not empty, the top element is the next greater element
            if (!stack.isEmpty()) {
                result[i] = arr[stack.peek()];
            }
            
            // Push the current index onto the stack
            stack.push(i);
        }
		return result;
	}
}   