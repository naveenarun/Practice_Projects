import java.math.BigInteger;

class q_20 {
	static BigInteger factorial(int x) {
		BigInteger result = BigInteger.valueOf(x);
		if (x == 1) { return BigInteger.valueOf(1); }
		else { return result.multiply(factorial(x-1)); }
	}

	public static void main(String[] args) {
		String result = factorial(100).toString();
		int sum = 0;
		for(int i=0; i<result.length(); i++) {
			sum += Integer.parseInt(result.substring(i,i+1));
		}
		System.out.println(sum);
	}
}

