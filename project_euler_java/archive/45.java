class q_45 {
	static boolean isShape(long x, long n) {
		int currSubtract = 1;
		while (x > 0) {
			x -= currSubtract;
			currSubtract += n-2;
		}
		return x == 0;
	}

	static long hex_num(long i) {
		return i*(2*i-1);
	}

	public static void main(String[] args) {
		long n=143;
		boolean isAll = false;
		while (!isAll) {
			n++;
			long i = hex_num(n);
			isAll = isShape(i,3) && isShape(i,5) && isShape(i,6);
		}
		System.out.println(hex_num(n));
	}
}

