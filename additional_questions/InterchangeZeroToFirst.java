package additional_questions;

import java.util.Arrays;

public class InterchangeZeroToFirst {
		
	//Program to implement the all the zeroes at start of the array.
	//note : No extra array space should be created. 
	// [2, 0, 1, 10, 0, 0] , Output : [0, 0, 0, 2, 1, 10]
		
	public static void main(String[] args) {
		
		int[] zero = {2, 0, 1, 10, 0, 0};
		
		int[] result = zeroComesFirst(zero);
		System.out.println(Arrays.toString(result));
	}
	
	private static int[] zeroComesFirst(int[] arr) {
		
		int index = arr.length-1, countZero = 0;
		
		for(int i=index; i>=0; i--) {
			
			if(arr[i]!= 0) {
				arr[index] = arr[i];
				index--;
			}
			else {
				countZero++;
			}
				
		}
		
		for(int i = 0; i<countZero; i++) {
			arr[i] = 0;
		}
		
		
		return arr;
	}
}
