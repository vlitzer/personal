package projecteuler.problem009;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import projecteuler.problem003.PrimeNumber;

public class SpecialPythagoreanTriplet {

	public static void main(String[] arg) {
		
		
		generateTriplet(1500);
//		for(Triplet tr : generateTriplet(500)) {
//			
//			System.out.println("# " + tr.a + " " + tr.b + " "+ tr.c);
//			
//			if(tr.a + tr.b + tr.c == 1000) {
//				System.out.println("found! " + tr.a + " " + tr.b + " "+ tr.c);
//				return;
//			}
//		}
	}

	@SuppressWarnings("unchecked")
	public static List<Triplet> generateTriplet(int amount) {
		int max = amount;
		List<Triplet> triplets = new ArrayList<Triplet>(amount);
		for (int k = 1; k < 100; k++) {
			System.out.println(k);
			for (int n = 1; n < max; n++) {
				for (int m = (n + 1); m < max; m++) {
					
					if ((m - n) % 2 > 0) {
						if (PrimeNumber.isCoprime(m, n)) {
//							System.out.println("k(" + k + ") m(" + m + ") n(" + n + ")");
							long a = (long) (k * (Math.pow(m, 2) - Math.pow(n, 2)));
							long b = k * (2 * m * n);
							long c = (long) (k * (Math.pow(m, 2) + Math.pow(n, 2)));
//							System.out.println( (a +  b + c));
							if (a + b + c == 1000) {
								System.out.println("Triplet found = " + a + " " + b + " " + c);
								return null;
//								triplets.add(new Triplet(a, b, c));
							}
						}
					}
				}
			}
		}
		Collections.sort(triplets);
		return triplets;
	}


}
