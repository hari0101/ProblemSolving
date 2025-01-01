package day6_practicalwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntersectionOfTwoSortedArray {
	
	//To implement the program to find the intersection of the two sorted array
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//First Array
		int size = scan.nextInt();
		int[] first = new int[size];
		for(int i = 0; i<first.length; i++) {
			first[i] = scan.nextInt();
		}
		
		//Second Array
		int size2 = scan.nextInt();
		int[] second = new int[size2];
		for(int i = 0; i<second.length; i++) {
			second[i] = scan.nextInt();
		}
		
		List<Integer> result = intersectionTwoArrays(first, second);
		
		System.out.println(result);
		
		scan.close();
	}
	
	static List<Integer> intersectionTwoArrays(int[] first, int[] second) {
		List<Integer> list = new ArrayList<>();
		
		//Two pointer approach iterate entire at the same time compare with each pointer at the time.
		int i = 0, j = 0;
		//While loop breaks if the i and j reached the length of two array. 
		while(i < first.length && j < second.length ) {
			
			//if the two pointed arrays elements are equal add to the list.
			if(first[i] == second[j]) {
				list.add(first[i]);
				//Since we add the element we need move the two pointer to check other elements;
				i++;
				j++;
			}
			//Since it's the sorted array if the element in first is smaller than element in second array move the i.
			else if(first[i] < second[j]) {
				i++;
			}
			//j++ moves the pointer if the element is smaller than the first array elements.
			else {
				j++;
			}
			
		}
		
		return list;
	}
	
}
