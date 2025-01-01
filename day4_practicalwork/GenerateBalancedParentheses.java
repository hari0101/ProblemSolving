package day4_practicalwork;

import java.util.Scanner;

public class GenerateBalancedParentheses {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		
		//First method creating the char array which makes Space complexity Quadric n*n 
		char[] ch = new char[size*2];
		generateParentheses(ch, size, 0, 0, 0);
		
		//Second method just print the value or append the answer with the stringbuilder.
		genParenthese(size, 0, 0, "");
		scan.close();

	}
	
	static void genParenthese(int n, int open, int close, String append) {
		
		//if the open and close becomes the size of the value the append result is printed.
		if(open == n && close == n) {
			System.out.println(append);
			return;
		}
		
		//Check if the open value should run until the n input.
		if(open < n) {
			genParenthese(n, open+1, close, append+"(");
		}
		
		//It runs until the complete number of open value.
		if(close < open) {
			genParenthese(n, open, close+1, append+")");
		}
	}
	
	
	static void generateParentheses(char[] c, int size, int idx, int open, int close) {
		//If the 
		if(idx == c.length) {
			System.out.println(c);
			return;
		}
		
		if(open < size) {
			c[idx] = '(';
			generateParentheses(c, size, idx+1, open+1, close);
		}
		
		if(close < open) {
			c[idx] = ')';
			generateParentheses(c, size, idx+1, open, close+1);
		}
		
	}

}

