package day3_practicalwork;

import java.util.Scanner;

public class StringSubsequences {
	
	//Print the subsequenence of the given array.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
	
		subsequence(input, "");
		
		scan.close();
	}
	
	static void subsequence(String str, String current) {
		
		if(str.isEmpty()) {
			System.out.println(current);
			return;
		}
		
		subsequence(str.substring(1), current + str.charAt(0));
		
		subsequence(str.substring(1), current);
	}
}
