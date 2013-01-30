package projecteuler.problem005;

public class EvenlyDivisibleRange {
	public static void main(String[] arg) {
		int divisible_range = 20;
		int smallest_solution = 0;
		int current_number = divisible_range;
		
		do {
			boolean evenlyDivisible = true;
			for(int a = 1; a <= divisible_range; a++) {
				if(current_number % a > 0){
					evenlyDivisible = false;
					break;
				}
			}
			if(evenlyDivisible) { 
				smallest_solution = current_number;
			} else {
				current_number ++;
			}
		} while(smallest_solution == 0);
		
		System.out.println(smallest_solution);
	}
}
