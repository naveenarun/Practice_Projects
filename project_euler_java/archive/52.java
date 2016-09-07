class q_52 {
	static boolean containsSameDigits(long a, long b) {
		String a_str = Long.toString(a);
		String b_str = Long.toString(b);
		if (a_str.length() != b_str.length()) { return false; }
		for (char c : a_str.toCharArray()) {
			if (b_str.indexOf(c) == -1) {
				return false;
			}
		}
		return true;
	}

	static boolean multiplesSameDigits(long n) {
		for (int i=2; i<=6; i++) {
			if (!containsSameDigits(n,n*i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean isFound = false;
		long currNum = 1;
		while (!multiplesSameDigits(currNum)) {
			currNum++;
		}
		System.out.println(currNum);
	}
}

