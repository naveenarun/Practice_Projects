class q_7 {
	static boolean isPrime(long x) {
		int testVal = 2;
		while (testVal < x) {
			if (x % testVal == 0) {
				return false;
			}
			testVal++;
		}
		return true;
	}

	public static void main(String[] args) {
		int MAX_PRIMENUM = 10001;
		int curr_val = 1;
		int curr_index = 0;
		while (curr_index < MAX_PRIMENUM) {
			curr_val++;
			if (isPrime(curr_val)) {
				curr_index++;
			}
		}
		System.out.println(curr_val);
	}
}

