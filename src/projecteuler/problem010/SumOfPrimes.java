package projecteuler.problem010;

import java.util.List;

import projecteuler.problem003.PrimeNumber;

public class SumOfPrimes {
	public static long sumOfPrimes(long max) {
		long sum = 0;

		for (Long a : PrimeNumber.getPrimesByTrialDivision(max)) {
			sum = sum + a;
		}

		return sum;

	}
	
	public static void main(String[] arg) {
		System.out.println(SumOfPrimes.sumOfPrimes(2000000));
	}
}
