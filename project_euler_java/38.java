class q_38 {
	static String DIGITS = "123456789";

	static int numOccurrences(char c, String s) {
		return s.length() - s.replace(Character.toString(c),"").length();
	}

	static boolean isPandigital(String s) {
		if (s.length() != 9) {return false;}
		for (char c : DIGITS.toCharArray()) {
			if (numOccurrences(c,s) != 1) {
				return false;
			}
		}
		return true;
	}

	static String concatProd(int x, int n) {
		String start = "";
		for (int i=1; i<=n; i++) {
			start += Integer.toString(x*i);
		}
		return start;
	}

	public static void main(String[] args) {
		long best = 0L;
		for (int n=2; n<=9; n++) {
			for (int x=1; x<=(int)Math.pow(10,Math.ceil(9.0/n)); x++) {
				String myProd = concatProd(x,n);
				if (isPandigital(myProd)) {
					long myVal = Long.parseLong(myProd);
					best = myVal > best ? myVal : best;
				}
			}
		}
		System.out.println(best);
	}
}

