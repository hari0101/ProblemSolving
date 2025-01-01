package day1_practicalwork;

import java.util.Scanner;

public class GenerateNEvenNumbers {
	
//	3. WAP TO GENERATE A FIRST EVEN NUMEBERS WITH GIVEN INPUT N;
//		[input : 10] --> OUTPUT 2 4 6 8 10 12 14 16 18 20. 			
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count to get the first even numbers : ");
		int inputInt = scan.nextInt();
		
		int result = printEvenNumbers(inputInt);
		
		if(result == -1) { System.err.println("Number should greater than equal to '1' ");}
		
		scan.close();
	}
	
	private static int printEvenNumbers(int num) {
		
		if(num <= 0) {
			return -1;
		}
		
		for(int i=1; i<=num; i++) {
			
			System.out.print(2 * i);  // for N EVEN NUMBERS.
			
//			System.out.print(2 * i - 1); // for N ODD NUMBERS.
			
			if(i < num) {
				System.out.print(" ");
			}
		}
		
		return 1;
	}
	
		
	
}
