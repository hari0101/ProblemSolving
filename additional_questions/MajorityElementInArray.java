package additional_questions;

public class MajorityElementInArray {
	
	//Given the array of elements in which one element occurs is greater than equal to n/2 size [ where n is the size of the array!].
	// Find the majority elements INPUT [2, 2, 1, 4, 5, 2, 2], Output is 2.
	
	public static void main(String[] args) {
		
		int[] arr = {2, 2, 1, 4, 5, 2, 2};
		
		int result = getMajorityElement(arr);
		System.out.println(result);
	}
	
	private static int getMajorityElement(int[] arr) {
		int major = arr[0], votes = 1;
		
		for(int i=1; i<arr.length; i++) {
			
			if(votes == 0) {
				votes++;
				major = arr[i];
			}
			else if(major == arr[i]) {
				votes++;
			}
			else
			{
				votes--;
			}
			
		}
		return major;
	}
}
