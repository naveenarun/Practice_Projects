class q_30 {
	static int pow(int x, int n) {
		int myval = 1;
		for (int i=0; i<n; i++) {
			myval *= x;
		}
		return myval;
	}

	static int powerSum(int x, int n) {
		String a = Integer.toString(x);
		int length = a.length();
		int mysum = 0;
		for (int i=0; i<length; i++) {
			mysum += pow(Integer.parseInt(a.substring(i,i+1)),n);
		}
		return mysum;
	}

	public static void main(String[] args) {
		int mySum = 0;
		for (int i=2; i<=999999; i++) {
			if (i == powerSum(i,5)) {
				mySum += i;
			}
		}
		System.out.println(mySum);
	}
}

