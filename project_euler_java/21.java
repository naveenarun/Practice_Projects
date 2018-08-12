class q_21 {
	static int d(int x) {
		int sum = 0;
		for (int i=1; i<x; i++) {
			if (x % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	static boolean isAmicable(int x) {
		int b = d(x);
		if (x == b) { return false; }
		return x == d(b);
	}

	public static void main(String[] args) {
		long mysum = 0L;
		for (int i=1; i<10000; i++) {
			if (isAmicable(i)) {
				mysum += i;
			}
		}
		System.out.printf("Sum: %s\n",mysum);
	}
}

