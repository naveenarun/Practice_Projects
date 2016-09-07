import java.math.BigInteger;

class q_25 {
	public static void main(String[] args) {
		BigInteger a = BigInteger.valueOf(1);
		BigInteger b = a;
		BigInteger c;
		long termNumber = 2L;
		while (b.toString().length() != 1000) {
			c = b;
			b = b.add(a);
			a = c;
			termNumber++;
		}
		System.out.println(termNumber);
	}
}

