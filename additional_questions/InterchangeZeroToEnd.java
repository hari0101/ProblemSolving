package additional_questions;

public class InterchangeZeroToEnd {
	
	//Move all the zero at end of the array and elements in the array, Don't interchange the follow of the Non-zero elements.
	//Note : Don't create any extra Array space.
	//Input : [0, 6, 0, 2, 3, 0], Output : [6, 2, 3, 0, 0, 0]
	
	public static void main(String[] args) {
		
		int[] zero = {0, 6, 0, 2, 3, 0};
		
		int[] result = zeroGoesEnd(zero);
		
		for(int num : result) {
			System.out.print(num + " ");
		}
	}

	private static int[] zeroGoesEnd(int[] arr) {
		
		int countZero = 0, index = 0; //3
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]!=0) {
				arr[index] = arr[i];
				index++;
			}
			else {
				countZero++;
			}
		}
		
		for(int j = countZero; j<arr.length; j++) {
			arr[j] = 0;
		}
		
		return arr;
	}
}
