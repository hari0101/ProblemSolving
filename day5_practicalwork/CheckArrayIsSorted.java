package day5_practicalwork;

public class CheckArrayIsSorted {

	public static void main(String[] args) {
		
		int[] sort = {-1, 0, 1, 10, 20 ,100};
		
		boolean result = checkSortedRecursive(sort, 0);
		System.out.println(result);
		
		boolean $result = checkSortedBruteForce(sort);
		System.out.println($result);
	}
	
	//By BRUTE FORCE APPROACH
	static boolean checkSortedBruteForce(int[] arr) {
		
		//For loop till index 4 because we handled the 5th index in [i+1] so 5 times
		for(int i = 0; i < arr.length-1; i++) {
			
			//Simple index check, when we see the index 0 is not lesser then index 0+1 return false.
			if(!(arr[i] < arr[i+1])) {
				return false;
			}
		}
		
		return true;
	}
	
	
	//By RECURSIVE TECHNIQUE
	static boolean checkSortedRecursive(int[] arr, int index) {
		
		//Base condition
		if(index == arr.length-1) {
			return true;
		}
		//Two expression here first is the actual method oriented check and other is passed to differnt index of same method.
		//First it checks the common check if the index 0th is lesser than index 1th, it's true.
		
		//note : But the program will not end until other expression gives the true / false state.
		//if anyone of the other index return false there is no further check because we use AND operation to return FALSE.
		
		return arr[index] < arr[index + 1] && checkSortedRecursive(arr, index + 1);
	}
}
