class q_17 {
	static String getName(int num) {
		String[] DIGITS = {"NaN","one","two","three","four","five","six","seven","eight","nine"};
		String[] TENS = {"zero","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		String[] SPECIALS_TEN = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		if (num < 10) { return DIGITS[num]; }
		if (num < 100) {
			if (num % 10 == 0) { return TENS[num/10]; }
			if (num < 20) { return SPECIALS_TEN[num-11]; }
			else { return TENS[num/10] + " " + DIGITS[num-10*(num/10)]; }
		}
		if (num < 1000) {
			if (num % 100 == 0) { return DIGITS[num/100] + " hundred"; }
			else { return DIGITS[num/100] + " hundred and " + getName(num-100*(num/100)); }
		}
		if (num == 1000) { return "one thousand"; }
		return "idk";
	}
	public static void main(String[] args) {
		int mySum = 0;
		for (int i=1; i<=1000; i++) {
			mySum += getName(i).replace(" ","").length();
		}
		System.out.println(mySum);
	}
}

