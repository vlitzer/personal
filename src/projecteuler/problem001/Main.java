package projecteuler.problem001;

public class Main {
	public static void main(String[] arg) {
		int max = 1000;
		int sum = 0;
		
		for(int a = 1; a < max; a++) {
			if(a % 3 == 0 || a % 5 == 0) {
				sum = sum + a;
			}
		}
		
		System.out.println(sum);
	}
}
