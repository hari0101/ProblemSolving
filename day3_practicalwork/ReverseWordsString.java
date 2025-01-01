package day3_practicalwork;

import java.util.Scanner;

public class ReverseWordsString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to Reverse : ");
		
		String inputString = scan.nextLine();
		
		String result = reverseWords(inputString);
		System.out.println(result);
		scan.close();
	}
	
	private static void swapWords(char[] ch, int leftPoint, int rightPoint) {
		
		while(leftPoint<rightPoint) {
			char temp = ch[leftPoint];
			ch[leftPoint++] = ch[rightPoint];
			ch[rightPoint--] = temp;
		}
	}
	
	private static String reverseWords(String str) {
		
		if(str == null || str.isEmpty()) {
			System.err.println("Enter the valid String to Reverse!!");
		}
		char[] ch = str.toCharArray();
		
		int start = 0,len = ch.length;
		
		for(int pointer = 0; pointer<=len; pointer++) {
			if(pointer == len || ch[pointer] == ' ') {
				swapWords(ch, start, pointer-1);
				start = pointer + 1;
			}
		}
		
		return new String(ch);
	}
}
