package day3_practicalwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacters {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		int result = getFirstNonRepeatChar(input);
		System.out.println(result);
		scan.close();
	}
	
	private static int getFirstNonRepeatChar(String str) {
		//Initialized the Map to store the values in key-value pair
		Map<Character, Integer> charMap = new HashMap<>();
		//Convert the string into char array.
		char[] words = str.toCharArray();
		
		//Iterate towards the char array and put the characters in key and its occurence in the value.
		for(char ch : words) {
			//getordefault(), this method will set the default value for the every key if there is no value there.
			//Here our value is count of the character.
			charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
		}
		
		//check if the any character is equals to one in the map data.
		
		for(int i=0; i<words.length; i++) {
			
			if(charMap.get(words[i]) == 1) {
				return i;                       // return index if we found the single value character in the map.
			}
		}
		
		//return -1 if no first non repeative element avaliable in the string.
		return -1;
	}
}
