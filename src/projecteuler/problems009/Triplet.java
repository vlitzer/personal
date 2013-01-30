package projecteuler.problems009;

public class Triplet implements Comparable {
	public long a;
	public long b;
	public long c;

	public Triplet(long a2, long b2, long c2) {
		this.a = a2;
		this.b = b2;
		this.c = c2;

	}

	public boolean isValidTriplet() {
		return (((a * a) + (b * b)) == (c * c));
	}

	public boolean equals(Object arg0) {

		if (arg0 != null || arg0 instanceof Triplet) {
			Triplet obj = (Triplet) arg0;

			if (a == obj.a && b == obj.b && c == obj.c)
				return true;
			else
				return false;
		}else {
			return false;
		}
	}

	public static void main(String arg[]) {
		System.out.println(new Triplet(3, 4, 5).compareTo(new Triplet(3,4,2)));
	}

	public int compareTo(Object arg0) {
		Triplet obj = (Triplet) arg0;

		if (this.equals(obj)) {
			return 0;
		}

		if ((a + b + c) > (obj.a + obj.b + obj.c)) {
			return +1;
		} else {
			return -1;
		}
		// TODO Auto-generated method stub

	}

}
