import java.math.BigInteger;

class q_26 {
	static int stripFactors(int x) {
		while (x % 2 == 0) { x = x/2; }
		while (x % 5 == 0) { x = x/5; }
		return x;
	}
	static int lengthOfCycle(int x) {
		x = stripFactors(x);
		if (x==1) {return 0;}
		int curr_pow = 1;
		BigInteger base_val = BigInteger.valueOf(10);
		while ((base_val.pow(curr_pow).subtract(BigInteger.valueOf(1))).mod(BigInteger.valueOf(x)) != BigInteger.valueOf(0)) {
			curr_pow++;
		}
		return curr_pow;
	}
	public static void main(String[] args) {
		BigInteger zero = BigInteger.valueOf(0);
		int best = 0;
		int bestLength = 0;
		for (int i=2; i<1000; i++) {
			int cycleLength = lengthOfCycle(i);
			if (cycleLength > bestLength) { bestLength = cycleLength; best = i; }
		}
		System.out.printf("Best: %s; Cycle length: %s\n",best,bestLength);
	}
}

