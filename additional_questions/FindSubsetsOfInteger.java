package additional_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindSubsetsOfInteger {
	
	//Given an Integer array find the subset of the given array
	//Example [1,2,3] = [],[1],[2],[1,2],[2,3],[3],[1,3]
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		
		int[] subset = new int[size];
		
		for(int i=0; i<subset.length; i++) {
			subset[i] = scan.nextInt();
		}
		
		List<List<Integer>> result = findSubsetOfInteger(subset, size);
		System.out.println(result);
		scan.close();
	}
	
	static void generateAllSubsets(List<List<Integer>> result, List<Integer> templist, int[] set, int index) {
		
		//Add the templist value in every recursion call to the global object.
		result.add(new ArrayList<Integer>(templist));
		
		for(int i = index; i < set.length; i++) {
			
			//Add the first element in the array and invoke the same method to different combination.
			templist.add(set[i]);
			
			//It will generate the possible combination with every element in the array ex: [1, 2, 3]
			generateAllSubsets(result, templist, set, i+1);
			
			//Remove the every last element of the templist value in recursion.
			//we have backtracking one by one until it becomes empty []
			templist.remove(templist.size()-1);
		}
	
	}
		
	static List<List<Integer>> findSubsetOfInteger(int[] arr, int size) {
		//Calculate the size of entire subset with the base 2 and exponential
		 int listSize = (int)Math.pow(2, size);
		
		//Creating the LIST of list to store the subset values in list object [*object inside list is also list].
		List<List<Integer>> subset = new ArrayList<>(listSize);
		
		//Invoke the method to generate the subsets of the integers. 
		generateAllSubsets(subset, new ArrayList<Integer>(), arr, 0);
		
		//return subset result
		return subset;
	}
	
}	
		









