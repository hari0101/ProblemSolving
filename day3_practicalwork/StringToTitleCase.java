package day3_practicalwork;

import java.util.Scanner;

public class StringToTitleCase {
	
	//Convert the program to title case 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
	
		String result = convertTitleCase(input);
		
		System.out.println(result);
		scan.close();
	}	
	
	private static String convertTitleCase(String str) {
		//return if the Str length is 0 (or) str is null
		if(str == null || str.isEmpty()) {
			return str;
		}
		//Initialize one stringbuilder object to store the character sequenece.
		StringBuilder title = new StringBuilder();
		//flag to implement the uppercase, for space after character.
		boolean isStartWord = true;
		
		//Converts the string to sequenece of characters
		for(char ch : str.toCharArray()) {
			//Checks if the ch is space character if 'yes' it will append.[Character is non-primitive datatype which have method to find the whitespace]
			if(Character.isWhitespace(ch)) {
				//Add to the string builder
				title.append(ch);
				//make it true - if it's not true
				isStartWord = true;
			}
			
			// Else block runs everytime after the whitespace character, Every whitespace first character should be uppercase.
			else if(isStartWord) {
				title.append(Character.toUpperCase(ch));
				isStartWord = false;
			}
			//Else block runs to append rest of the character as a lowercase.
			else
			{
				title.append(Character.toLowerCase(ch));
			}
			
		}
		//Return the stringbuilder object as string type
		return title.toString();
	}
}
