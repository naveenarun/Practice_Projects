import java.math.BigInteger;

class q_48 {
	static BigInteger selfPower(int x) {
		BigInteger q = BigInteger.valueOf(x);
		return q.pow(x);
	}
	public static void main(String[] args) {
		BigInteger mySum = BigInteger.valueOf(0);
		for (int i=1; i<1000; i++) {
			mySum = mySum.add(selfPower(i));
			String temp = mySum.toString();
			temp = temp.substring(Math.max(0,temp.length()-10),temp.length());
			mySum = new BigInteger(temp);
		}
		System.out.println(mySum);
	}
}

