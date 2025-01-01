package day5_practicalwork;

import java.util.Arrays;
import java.util.Scanner;

public class OrderArrayByStringLength {
	
	//In given array of String order the String based on their length or convert string arrays into ascending order.
	//Input : {"Selenium","TestNG", "Java", "Maven", "Automation"}
	//Output as {"Java", "Maven", "TestNG", "Selenium", "Automation"}.
	
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int arraySize = scan.nextInt();
//		
//		String[] testing = new String[arraySize];
//		
//		for(int i = 0; i<testing.length; i++) {
//			testing[i] = scan.nextLine();
//		}
		
		String[] testing = {"Selenium","TestNG", "Java", "Maven", "Automation"};
		String[] result = rearrangeStrings(testing);
		
		System.out.println(Arrays.toString(result));
	}

	static String[] rearrangeStrings(String[] arr) {
		
		if(arr.length <= 0) {
			return arr;
		}
		
		//insertion sort
		for(int i=0; i<arr.length-1; i++) { 
			
			for(int j = i+1; j>0; j--) { // 0 < 1
				if(arr[j].length() < arr[j-1].length()) {
					String temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
			
		
		return arr;
	}
}
