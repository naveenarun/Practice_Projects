class q_4 {
	static boolean isPalindrome(int x) {
		String x_str = Integer.toString(x);
		for(int i=0; i<x_str.length()/2; i++) {
			if (x_str.charAt(i) != x_str.charAt(x_str.length()-i-1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int max_pal = 0;
		for(int i=100;i<1000;i++) {
			for(int j=100;j<1000;j++) {
				max_pal = (i*j>max_pal && isPalindrome(i*j)) ? i*j : max_pal;
			}
		}
		System.out.println(max_pal);
	}
}

