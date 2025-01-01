package day3_practicalwork;

import java.util.Scanner;

public class StringRotationOfAnotherString {
	
	//3. Write a program to check if a string is rotation of another string.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputstring = scan.nextLine();
		String inputstring2 = scan.nextLine();
		
		boolean bool = isStringRotated(inputstring, inputstring2);
		
		String result = bool ? "String is rotation of another" : "String is not rotation of another";
		System.out.println(result);
		scan.close();
	}	
	
	private static boolean isStringRotated(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		String[] arr1 = str1.split("\\s+");
		String[] arr2 = str2.split("\\s+");
		
		int start = 0, n = arr1.length, end = n - 1 ;
		
		while(start < n) {
			
			if(!(arr1[start].equals(arr2[end]))) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
		
	}
}
