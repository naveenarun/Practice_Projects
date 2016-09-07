class q_15 {
	static int count = 0;

	static void movePoint(int a, int b, int size) {
		if (a == size && b == size) { count++; }
		if (a < size) { movePoint(a+1,b,size); }
		if (b < size) { movePoint(a,b+1,size); }
		return;
	}

	static long combination(int a, int b) {
		long myProduct = 1L;
		if (b == 0) { return 1; }
		return myProduct * combination(a,b-1) * (a-b+1)/b;
	}

	public static void main(String[] args) {
		System.out.println(combination(40,20));
	}
}

