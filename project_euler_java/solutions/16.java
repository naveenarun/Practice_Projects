import java.math.BigInteger;

class q_16 {
	public static void main(String[] args) {
		BigInteger q = new BigInteger("2");
		String myval = q.pow(1000).toString();
		int mysum = 0;
		for (int i=0; i<myval.length(); i++) {
			mysum += Integer.parseInt(myval.substring(i,i+1));
		}
		System.out.println(mysum);
		
	}
}

