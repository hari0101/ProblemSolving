package day3_practicalwork;

import java.util.Scanner;

public class CompressionOfString {
	
	//Compress the given string by adding their count next to the character.
	// Input : aabbccddddeee  Output : a2b2c2d4e3 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		String result = compressString(input);
		System.out.println(result);
		
		scan.close();
	}
	
	private static String compressString(String str) {
		
		StringBuilder compress = new StringBuilder();
		int count = 1;
		
		for(int i=0; i<str.length(); i++) {
			
			if(i+1 < str.length() && str.charAt(i)==str.charAt(i+1)) {
				count++;
			}
			else
			{
				compress.append(str.charAt(i)).append(count);
				count = 1;
			}
		}
		
		return compress.toString();
	}
	
	
}
