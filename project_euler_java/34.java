class q_34 {
	static int factorial(int x) {
		if (x == 0) {return 1;}
		return x*factorial(x-1);
	}
	static int factorialSum(int x) {
		String q = Integer.toString(x);
		int mySum = 0;
		for (int i=0; i<q.length(); i++) {
			mySum += factorial(Integer.parseInt(q.substring(i,i+1)));
		}
		return mySum;
	}

	public static void main(String[] args) {
		long mySum = 0L;
		for (int i=3; i<=999999; i++) {
			if (i == factorialSum(i)) {
				mySum += i;
			}
		}
		System.out.println(mySum);
	}
}

