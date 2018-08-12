class q_5 {
	static boolean isDivUpTo(int x, int max) {
		for (int i=2; i<=max; i++) {
			if (x % i != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int MAX_RANGE = 20;
		int my_num = 2520;
		while (!isDivUpTo(my_num,MAX_RANGE)) {
			my_num++;
		}
		System.out.println(my_num);
	}
}

