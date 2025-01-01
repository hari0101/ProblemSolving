package day1_practicalwork;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		
		reverseString(inputString);
		
		scan.close();
	}

	private static void reverseString(String word) {
		
		if(word.length() == 0) {
			return;
		}
		String[] str = word.split("\\s+");
		
		int start = str.length-1, end = 0;
		
		while(start >= end) {
			System.out.print(str[start]);
			
			if(!(start==0)){
				System.out.print(" ");
			}
			
			start--;
		}
	
		
	}
}
