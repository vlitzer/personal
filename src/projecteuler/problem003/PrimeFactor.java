package projecteuler.problem003;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public static void main(String[] arg) {
//		for(Long inte : getPrimeFactors(600851475143l))
//			System.out.println(inte);
		
		System.out.println("=" + getLargestPrimeFactor(600851475143l));
	}
	
	public static boolean isPrimeNumber(long n) {
		if (n%2==0) return false;
		
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static long getLargestPrimeFactor(long number) {
		
		
		for(long a = (number-1); a > 1; a--) {
			if(a%2 == 0) 
				System.out.println("#" + a);
			
			if(isPrimeNumber(a) && number % a == 0){
				return a;
			}
		}
		
		return 0l;
	}
	public static List<Long> getPrimeFactors(long number) {		
		
		List<Long> solution = new ArrayList<Long>();
		
		for(long a = 2; a < number; a++) {
			if(a%1000 == 0) 
				System.out.println(a + " - " + (number - a) + " remaining");
			if(isPrimeNumber(a) && number % a == 0){
				solution.add(a);
			}
				
		}
		
		return solution;
	}
	
}
