class q_32 {
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

	public static void main(String[] args) {
		long LOWER = 100000000L;
		long UPPER = 999999999L;
		for(long i=
	}
}

