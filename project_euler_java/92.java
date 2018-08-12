class q_92 {
	static int squareSum(int x) {
		String x_str = Integer.toString(x);
		int mySum = 0;
		for(int i=0; i<x_str.length(); i++) {
			int currDigit = Integer.parseInt(x_str.substring(i,i+1));
			mySum += currDigit * currDigit;
		}
		return mySum;
	}

	static boolean sqLoopTo89(int x) {
		int curr_val = x;
		while (!(curr_val == 1 || curr_val == 89)) {
			curr_val = squareSum(curr_val);
		}
		return curr_val == 89;
	}

	public static void main(String[] args) {
		int myCount = 0;
		for (int i=1; i<=10000000; i++) {
			if (sqLoopTo89(i)) { myCount++; }
		}
		System.out.println(myCount);
	}
}

