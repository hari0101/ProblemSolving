package day1_practicalwork;

import java.util.Scanner;

public class FindGCDofTwoNumbers {
	
	//To find the GCD/HCF of the given two numbers 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int firstnum = scan.nextInt();
		
		System.out.println("Enter the Second number : ");
		int secondnum = scan.nextInt();
		
		int result = findGCDOfNumbers(firstnum, secondnum);
		
		String value = switch(result) {
		case -1 -> "Number should not be Zero";
		case 0 -> "The GCD of " +firstnum+" & "+ secondnum +" is "+ result;
		default -> "The GCD of " +firstnum+" & "+ secondnum + " is "+ result; 	
		};
		
		System.out.println(value);
		
		scan.close();
	}
	
	private static int findGCDOfNumbers(int first, int second) {
		
		if(first ==0 || second ==0) {
			return -1;
		}
		
		if(first == second) {
			return 0;
		}
		
		while(second != 0) {
			int remainder = first % second;
			first = second;
			second = remainder;
		}
		
		return -first;
	}
}
