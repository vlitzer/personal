package bonamici.math;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] arg) {
		for (Long a : getPrimeFactors(600851475143l)) {
			System.out.println(a);
		}
	}

	// def trial_division(n):
	// """Return a list of the prime factors for a natural number."""
	// if n == 1: return [1]
	// primes = prime_sieve(int(n**0.5) + 1)
	// prime_factors = []
	//
	// for p in primes:
	// if p*p > n: break
	// while n % p == 0:
	// prime_factors.append(p)
	// n //= p
	// if n > 1: prime_factors.append(n)
	//
	// return prime_factors

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
