import java.math.BigInteger;

class q_65 {
	static BigInteger gen_coeff(long x) {
		if (x == 0) { return BigInteger.valueOf(2); }
		return BigInteger.valueOf(x%3==2?2*(x/3)+2:1);
	}

	static BigInteger gen_num(int x) {
		BigInteger num = BigInteger.valueOf(1);
		BigInteger denom = gen_coeff(x);
		BigInteger tmp;
		for (int i=x-1; i>=0; i--) {
			num = num.add(denom.multiply(gen_coeff(i)));
			tmp = denom;
			denom = num;
			num = tmp;
		}
		return denom;
	}

	static int sum_digits(BigInteger x) {
		String x_str = x.toString();
		int mySum = 0;
		for(int i=0; i<x_str.length(); i++) {
			mySum += Integer.parseInt(x_str.substring(i,i+1));
		}
		return mySum;
	}
		
	public static void main(String[] args) {
		System.out.println(sum_digits(gen_num(99)));
	}
}

