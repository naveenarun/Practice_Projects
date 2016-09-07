import java.math.BigInteger;

class q_53 {
	static BigInteger factorial(BigInteger x) {
		if (x == BigInteger.valueOf(0)) { return BigInteger.valueOf(1); };
		return x.multiply(factorial(x.subtract(BigInteger.valueOf(1))));
	}

	static boolean isBigCombination(int n, int r) {
		BigInteger n_b = BigInteger.valueOf(n);
		BigInteger r_b = BigInteger.valueOf(r);
		BigInteger n_r_b = BigInteger.valueOf(n-r);
		BigInteger mil = new BigInteger("1000000");
		BigInteger comb = factorial(n_b).divide(factorial(r_b).multiply(factorial(n_r_b)));
		if (comb.compareTo(mil) == 1) { return true; }
		return false;
	}

	public static void main(String[] args) {
		int numBig = 0;
		for (int n=1; n<=100; n++) {
			for (int r=0; r<=n; r++) {
				if (isBigCombination(n,r)) {
					numBig++;
				}
			}
		}
		System.out.println(numBig);
	}
}

