class q_36 {
	static boolean isPalindrome(String s) {
		for (int i=0; i<s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length()-i-1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		long mySum = 0L;
		for (int i=1; i<1000000; i++) {
			if (isPalindrome(Integer.toString(i)) && isPalindrome(Integer.toBinaryString(i))) {
				mySum += i;
			}
		}
		System.out.println(mySum);
	}
}

