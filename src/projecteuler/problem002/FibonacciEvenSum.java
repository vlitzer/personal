package projecteuler.problem002;

public class FibonacciEvenSum {
	public static void main(String[] arg) {
		int max = 4000000;
		int previous = 0;
		int current = 1;
		int nextFibonacci;
		
		int sum = 0;
		while(current < max){ 
			nextFibonacci = getNextFibonacci(previous, current);
			
			if(isEven(nextFibonacci) && (nextFibonacci < max)) {
				System.out.println(nextFibonacci);
				sum = sum + nextFibonacci;
			}
			
			previous = current;
			current = nextFibonacci;
			
		}
		
		System.out.println("sum of even < to " + max + ": " + sum);
		
		
	}
	
	public static int getNextFibonacci(int first, int second) {
		return first + second;
	}
	
	public static boolean isEven(int number) {
		if(number % 2 == 0) 
			return true;
		else 
			return false;
	}
}
