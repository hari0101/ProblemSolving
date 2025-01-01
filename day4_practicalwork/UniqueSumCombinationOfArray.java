package day4_practicalwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UniqueSumCombinationOfArray {
	
	//Given a collection of candidate numbers and a target, find all the unique combinations of numbers that sum of the target.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		
		int[] unique = new int[size];
		
		for(int i=0; i<unique.length; i++) {
			unique[i] = scan.nextInt();
		}
		
		int target = scan.nextInt();
		
		//Sort array before use
		Arrays.sort(unique);
		//Create a new arraylist with arraylist as object holding. 
		List<List<Integer>> sums = new ArrayList<>();
		sumOfCombinations(unique, target, 0, new ArrayList<>(), sums);
		System.out.println(sums);
		
		scan.close();
	}
	
	static void sumOfCombinations(int[] arr, int target, int idx, List<Integer> templist, List<List<Integer>> result) {
		
		//Added all the combination at every recursion end with new arraylist from the temporary provider TEMPLIST.
		if(target == 0) {
			result.add(new ArrayList<>(templist));
			return;
		}
		
		//EX : [1,1,1,2,3] & target is 4
		//Starts at index of 0 first till size is 5. 
		for(int i = idx; i < arr.length; i++) {
			
			/*check the condition if the 0 > 0 and the arr[0] value is equal to arr[-1] value. Initially it is false.*/
			if(i > idx && arr[i] == arr[i - 1]) {
				continue;
			}
			
			/*check if the arr[0] value is greater then target.
			 * Note: Since the array is sorted the highest value is at end 
			*/
			if(arr[i] > target) {
				break;
			}
			
			//store the array of value index 0 at temp arraylist of 0th index.
			templist.add(arr[i]);
			/*pass the same templist to the recursion call for the more possible solutions and back to the original form.
			* here i have passed the value of the arr, target is 4 - 1, i = 0, templist stored the 1, result to collect the complete array. 
			* 		
			* it runs till target passed in the method become 0 
			*/
			
			sumOfCombinations(arr, target - arr[i], i, templist, result);
			
			//For the every recursion call over remove the end element of the temp which comes to the original.
			//NOTE: templist and the result ARRAYLIST are static for all the recursion call.
			templist.remove(templist.size() - 1);
		}
		
	}
}
