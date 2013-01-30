package projecteuler.problem004;

public class NumberPalindrome {
	public static void main(String[] arg) {
		int factor1 = 999;
		int factor2 = 999;
		
		String original = "";
		String reverse = "";
		
		int container_sum = 0;
		int container_value = 0;
		
		//
		
		for(int a = factor1; a >= 100; a--) {
			for(int b = factor2; b >= 100; b--) {
				original = String.valueOf(a * b);
				reverse = new StringBuffer(original).reverse().toString();
//				System.out.println("   " + a + " * " + b + " = " + original + " / " + reverse);
				if(original.equals(reverse)) {
					if((a+b) > container_sum) { 
						container_sum = a+b;
						container_value = a*b;
						System.out.println("   " + a + " * " + b + " = " + original + " / " + reverse);
					}					
				}
						
			}
		}
		System.out.println("done");
	}

}
