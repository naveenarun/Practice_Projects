import java.math.BigInteger;

class q_56 {
	static int digitalSumPower(int a, int b) {
		String s = BigInteger.valueOf(a).pow(b).toString();
		int sum = 0;
		for (char c : s.toCharArray()) {
			sum += c - '0';
		}
		return sum;
	}
	public static void main(String[] args) {
		int maxSum = 0;
		for (int a=1; a<100; a++) {
			for (int b=1; b<100; b++) {
				int mySum = digitalSumPower(a,b);
				if (mySum > maxSum) {
					maxSum = mySum;
				}
			}
		}
		System.out.println(maxSum);
	}
}

