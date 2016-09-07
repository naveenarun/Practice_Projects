class q_10 {
	static boolean isPrime(int x) {
		int startNum = 2;
		while (startNum <= Math.floor(Math.sqrt(x))) {
			if (x % startNum == 0) { return false; }
			startNum++;
		}
		return true;
	}
	public static void main(String[] args) {
		int MAX_NUM = 2000000;
		long my_sum = 0L;
		for (int i=2; i<MAX_NUM; i++) {
			if (isPrime(i)) { my_sum += i; }
		}
		System.out.println(my_sum);
	}
}

