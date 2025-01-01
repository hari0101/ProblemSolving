package day3_practicalwork;

public class GetKthPositionFibonacciNumber {
	
	//Enter the kth value and get the Which fibonacci number is lies on the place.
	
	public static void main(String[] args) {
		
		int result = getFibonacciNumber(3);
		
		System.out.println(result);
	}
	
	static int getFibonacciNumber(int fibo) {
		
		int start = 0, next = 1, step = 0 ; 
		
		if(fibo == 2) {
			return next;
		}
		
		for(int i=0; i<fibo-1; i++) {
			step = next + start;
			start = next;
			next = step;
			
		}
		
		return step;
	}
}
