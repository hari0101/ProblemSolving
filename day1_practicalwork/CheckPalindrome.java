package day1_practicalwork;

import java.util.Scanner;

public class CheckPalindrome {

	// Using the ( TWO POINTERS APPROACH ) check the first index and last index matches. 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String inputString = scan.nextLine();
		
		boolean state = isStringPalindrome(inputString);
		
		String result = state ? "It is Palindrome!" : "It is not Palindrome!";
		System.out.println(result);
		scan.close();
	}

	private static boolean isStringPalindrome(String words) {
		
		if(words == null || words.equals(" ")) {
			System.err.println("Given String is Invalid!!");
		}
		
		String str = words.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); 
		//Regex code indentify the character that doesn't starts with a-z, A-Z and 0-9. will be replaced by "";
		int start = 0, end = str.length()-1;
		//Max, i stay away at Six A.M!
		
		while(start<end) {
			
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}
}
