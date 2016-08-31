import java.math.BigInteger;
import java.util.HashSet;

class q_29 {
	static BigInteger pow(int a, int b) {
		return BigInteger.valueOf(a).pow(b);
	}
	public static void main(String[] args) {
		HashSet<BigInteger> a = new HashSet<BigInteger>();
		for(int i=2; i<=100; i++) {
			for (int j=2; j<=100; j++) {
				a.add(pow(i,j));
			}
		}
		System.out.println(a.size());
	}
}

