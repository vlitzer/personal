package projecteuler.problem006;

public class SumSquareDifference {
	public static void main(String[] arg) {
		int max = 100;
		
		long sum_exp = 0;
		long exp_sum = 0;
		
		for(int a = 1; a <= max; a++) { 
			sum_exp = (long) (sum_exp + (Math.pow(a, 2)));
			exp_sum = exp_sum + a;
		}
		
		exp_sum = (long) Math.pow(exp_sum, 2);
		
		System.out.println("Sum of " + max +" squared numbers=" + sum_exp);
		System.out.println("Sum of " + max +" numbers squared =" + exp_sum);
		System.out.println("Difference= " + (exp_sum - sum_exp));
	}
}
