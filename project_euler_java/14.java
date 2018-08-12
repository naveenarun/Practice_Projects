class q_14 {
	static long collatz(long n) {
		return n % 2 == 0 ? n/2 : 3*n + 1;
	}

	static int collatzLength(long n) {
		int count = 1;
		while (n != 1) {
			n = collatz(n);
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int maxVal = 0;
		int maxLength = 0;
		int mylen = 0;
		for (int i=1; i<1000000; i++) {
			mylen = collatzLength(i);
			if (mylen > maxLength) { maxLength = mylen; maxVal = i; }
		}
		System.out.printf("%s: %s\n",maxVal,maxLength);
	}
}

