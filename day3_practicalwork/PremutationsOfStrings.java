package day3_practicalwork;

import java.util.Scanner;

public class PremutationsOfStrings {
	
	//Implement a program to find all the premutations of string.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
	
		permutations(input.toCharArray(), 0);
		
		scan.close();
	}
	
	static void permutations(char[] ch, int start) {
		if(start == ch.length-1) {
			System.out.println(ch);
			return;
		}
		
		for(int i= start; i<ch.length; i++) {
			
			swap(ch, i, start);
			permutations(ch, start+1);
			swap(ch, i, start);
		}
		
	}
	
	static void swap(char[] c, int start, int end) {
			
		char temp = c[start];
		c[start] = c[end];
		c[end] = temp;
	}
}
