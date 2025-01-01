package day4_practicalwork;

import java.util.Scanner;

public class SumOfDigitsUsingRecursion {
	
	//To implement the program to find the sum of the given digits
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputInt = scan.nextInt();
		
		sumOfDigits(inputInt, 0);
		
		scan.close();
	}
	
	//123
	static void sumOfDigits(int num, int result) {
		
		//base condition the result keep on additing the last number until the num [ex : 123] becomes 0;
		if(num == 0) {
			System.out.println(result);
			return;
		}
		
		//Get the last number of the digit
		int last = num%10;
		//Sum the last number with result in every recursion.
		result =  result+last;
		//Keep adding the num last digit to the result until the num becomes the 0.
		sumOfDigits(num/10, result);
		
	}

}
