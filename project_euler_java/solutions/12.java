class q_12 {
	static int numDivisors(long x) {
		int num = 0;
		for (int i=1; i<=x; i++) {
			if (x % i == 0) { num++; }
		}
		return num;	
	}

	static int numDivisorsFast(long x) {
		int num = 1;
		long testval = 1L;
		int multiples = 0;
		long prev = 0L;
		while (x != 1) {
			testval++;
			if (x % testval == 0) {
				multiples++;
				if (testval != prev) {
					num *= multiples;
					multiples = 1;
					prev = testval;
				}
				x = x/testval;
				testval = prev-1;
			}
		}
		num *= multiples+1;
		return num;
	}

	public static void main(String[] args) {
		long my_val = 1L;
		while (numDivisors(my_val*(my_val+1)/2) < 500) {
			my_val++;
		}
		/*while (numDivisors(my_val*(my_val+1)/2) < 500) {
			my_val++;
		}*/
		System.out.println(my_val*(my_val+1)/2);
	}
}

