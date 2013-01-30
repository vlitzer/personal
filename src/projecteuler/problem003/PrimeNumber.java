package projecteuler.problem003;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] arg) {

		
		System.out.println(isCoprime(14, 16));
	}
	
	public static boolean isCoprime(long a, long b) {
		if(findGreatCommonDivisor(a, b) > 1) 
			return false;
		else
			return true;
	}
	
	public static long findGreatCommonDivisor(long a, long b) {
		if(a < b) {
			long temp = a;
			a = b;
			b = temp;
		}
		
		long rk2 = a;
		long rk1 = b;
		long rk = 0;
		long qk = 0;
		
		
		do{
			//rk2 = qk * rk1 + rk
			qk = rk2 / rk1;
			rk = rk2 % rk1;
			
//			System.out.println(rk2 + " = " + qk + " * " + rk1 + " + " + rk);
			
			if(rk == 0) {
				return rk1;
			}
			
			rk2 = rk1;
			rk1 = rk;
			
		} while(rk > 0);
		
		return 0;
	}

	public static List<Long> getPrimeFactors(long number) {
		List<Long> primeFactorList = new ArrayList<Long>();
		if (number == 1) {
			primeFactorList.add(1l);
			return primeFactorList;
		}

		List<Long> primeList = getPrimesByTrialDivision((long) (Math.sqrt(number) + 1));
		for (Long p : primeList) {
			if ((p * p) > number)
				break;
			while (number % p == 0) {
				primeFactorList.add(p);
				number = number / p;
			}
		}
		if (number > 1) {
			primeFactorList.add(number);
		}
		return primeFactorList;
	}

	public static long getTHPrime(int thNumber) {
		int counter = 0;
		int current = 2;

		while (true) {
			if (isPrime(current)) {
				counter++;
				System.out.println(counter);
				if (counter == thNumber) {
					return current;
				}

			}
			current++;
		}
	}

	public static List<Long> getPrimesByTrialDivision(long max) {
		List<Long> list = new ArrayList<Long>();

		for (long a = 2; a <= max; a++) {
			if (isPrime(a))
				list.add(a);
		}
		return list;
	}

	public static boolean isPrime(long a) {
		if (a == 2) {
			return true;
		} else if (a <= 1 || a % 2 == 0) {
			return false;
		}
		long max = (long) Math.sqrt(a);
		for (long n = 3; n <= max; n += 2) {
			if (a % n == 0) {
				return false;
			}
		}
		return true;
	}


}
