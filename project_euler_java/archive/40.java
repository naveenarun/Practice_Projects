class q_40 {
	static int getPos(String x,int n) {
		return Integer.parseInt(x.substring(n,n+1));
	}

	static int getBound(int numdigits) {
		int pos = 0;
		for (int i=1; i<=numdigits; i++) {
			pos += i*((int)Math.pow(10,i)-(int)Math.pow(10,i-1));
		}
		return pos;
	}

	static int getDigit(int i) {
		int numDigits = 1;
		while (getBound(numDigits) < i) {
			numDigits++;
		}
		int minIndex = getBound(numDigits-1);
		int mynum = (i - minIndex - 1)/numDigits + (int)Math.pow(10,numDigits-1);
		int myPlace = (i - minIndex - 1) % numDigits;
		String myChar = Integer.toString(mynum).substring(myPlace,myPlace+1);
		return Integer.valueOf(myChar);
	}

	public static void main(String[] args) {
		int mySum = 1;
		for (int i=0; i<=6; i++) { mySum *= getDigit((int)Math.pow(10,i)); }
		System.out.println(mySum);
	}
}

