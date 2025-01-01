package day5_practicalwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class KFrequentElements {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		
		mostFrequentElement(arr, k);
		scan.close();
	}

	static void mostFrequentElement(int[] arr, int k) {
		//Created the array of list to hold all the elements.
		List<Integer>[] bucket = new List[arr.length-1];
		//Created a map to get all the frequency count
		//Actual element is in KEY | Count as VALUE
		Map<Integer,Integer> map = new HashMap<>();
		
		//insert all the elements and its frequency first to the map.
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		//Start the iteration using keyset() method to get all the keys value in the map.
		//variable key hold all the key value of the map in each iteration.
		for(int key : map.keySet()) {
			//now store the count the specific key element.
			int freq = map.get(key);
			//Check if the count[Integer] position is null only if null create the arraylist on the index of the frquency index.
			if(bucket[freq] == null) {
				bucket[freq] = new ArrayList<Integer>();
			}
			//Add the all the KEY which is element to the Bucket index of frequency value which is VALUE.
			bucket[freq].add(key);
		}
		
		//Other function to get the kth largest
		findKthNumberElement(bucket, k);
	}
	
	static void findKthNumberElement(List<Integer>[] list, int k) {
		
		//Array will collect all the required elements which have more frequency. 
		int[] res = new int[k];
		//Count variable will be the index for the res array.
		int count = 0;
		//Iterate the List bucket from the backward because the most element contains at the end of the list.
		for(int i = list.length-1; i>=0 && count < k; i--) {
			//Don't check if the list index is empty.
			if(list[i] != null) {
				//Add the all the element which is avaliable in the array if list to the res array.
				for(Integer value : list[i]) {
					res[count++] = value;	
				}
			}
		// this condition only runs for the K -> required target time in the bucket.
		// when the count reached the kth value it should stop no go further.
		}
		
		System.out.println(Arrays.toString(res));
	}
	
}
